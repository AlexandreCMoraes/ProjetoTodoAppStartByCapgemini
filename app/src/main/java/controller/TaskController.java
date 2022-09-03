package controller;

import model.Task;
import util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskController {

    public void save(Task task) {
        String sql = "INSERT INTO tasks (" +
                "idProject, " +
                "name, " +
                "description, " +
                "completed," +
                "notes, " +
                "deadline, " +
                "createdAt, " +
                "updatedAt) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // estabelecendo conexao com o db
            connection = ConnectionFactory.getConnection();
            // Preparando a query
            statement = connection.prepareStatement(sql);
            // colocando os valores em cada "?" dando set
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            // data nova por causa das diferentes importações
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            // executando a query
            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a tarefa " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void update(Task task) {
        String sql = "UPDATE tasks SET " +
                "idProject = ?, " +
                "name = ?, " +
                "description = ?, " +
                "notes = ?, " +
                "completed = ?, " +
                "deadline = ?, " +
                "createdAt = ?, " +
                "updatedAt = ?, " +
                "WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isIsCompleted());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + e.getMessage(), e);
        }
    }

    public void removeById(int taskId) throws SQLException {
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // criando conexao com o db
            connection = ConnectionFactory.getConnection();
            // Preparando a query
            statement = connection.prepareStatement(sql);
            // mudando "?" para o id da tarefa
            statement.setInt(1, taskId);
            // executando a query
            statement.execute();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a tarefa" + e.getMessage(), e);
            // fecha conexao
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public List<Task> getAll(int idProject) {

        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        // nova lista com a lista de tarefas
        List<Task> tasks = new ArrayList<Task>();

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            // colocando o valor correspondente ao filtro de busca
            statement.setInt(1, idProject);
            // devolve o valor
            resultSet = statement.executeQuery();

            // enquanto houver dados a seguir, vai pegando os valores
            while (resultSet.next()) {
                Task task = new Task();
                // pega o id do resultSet da coluna id
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setDeadline(resultSet.getDate("deadline"));
                task.setCreatedAt(resultSet.getDate("createdAt"));
                task.setUpdatedAt(resultSet.getDate("updatedAt"));
                // colocando as tarefas criadas dentro de tasks
                tasks.add(task);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        // lista de tarefas criadas e load do db
        return tasks;
    }
}