package controller;

import model.Project;
import model.Task;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

public class ProjectController {

    public void save(Project project) {
        String sql = "INSERT INTO projects (" +
                "name, " +
                "createdAt, " +
                "updatedAt) " +
                "VALUES(?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            // estabelecendo conexao com o db
            connection = ConnectionFactory.getConnection();
            // Preparando a query
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(3, new Date(project.getUpdatedAt().getTime()));
            // executa a sql para insercao dos dados
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar projeto", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void update(Project project) {
        String sql = "UPDATE projects SET " +
                "name = ?, " +
                "description = ?, " +
                "createdAt = ?, " +
                "updatedAt = ?, " +
                "WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    // buscar todos os projetos do db
    public List<Project> getAll() {

        String sql = "SELECT * FROM tasks projects";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        // nova lista com a lista de tarefas
        List<Project> projects = new ArrayList<>();

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            // devolve o valor
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Project project = new Project();

                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));

                // colocando as tarefas criadas dentro de tasks
                projects.add(project);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        // lista de tarefas criadas e load do db
        return projects;
    }

    public void removeById(int idProject) {
        String sql = "DELETE FROM projects WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProject);
            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar a tarefa" + e.getMessage(), e);
            // fecha conexao
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
}

