/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author alexandre
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    // criado para associar a tarefa a um projeto
    Project project;

    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //instanciar variavel
        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneloolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarSave = new javax.swing.JLabel();
        jPanelTask = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jLabelDeadline = new javax.swing.JLabel();
        jLabelNotes = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jScrollPaneNotes = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jFormattedTextFieldDeadline = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPaneloolBar.setBackground(new java.awt.Color(0, 102, 51));
        jPaneloolBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelToolBarTitle.setFont(new java.awt.Font("Ubuntu Condensed", 1, 24)); // NOI18N
        jLabelToolBarTitle.setForeground(java.awt.Color.black);
        jLabelToolBarTitle.setText("  Tarefa");

        jLabelToolBarSave.setBackground(new java.awt.Color(106, 149, 157));
        jLabelToolBarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelToolBarSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelToolBarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToolBarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPaneloolBarLayout = new javax.swing.GroupLayout(jPaneloolBar);
        jPaneloolBar.setLayout(jPaneloolBarLayout);
        jPaneloolBarLayout.setHorizontalGroup(
            jPaneloolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneloolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneloolBarLayout.setVerticalGroup(
            jPaneloolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPaneloolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTask.setBackground(new java.awt.Color(37, 94, 105));
        jPanelTask.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelName.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabelName.setForeground(java.awt.Color.black);
        jLabelName.setText("Nome");

        jTextFieldName.setBackground(java.awt.Color.white);
        jTextFieldName.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jTextFieldName.setForeground(java.awt.Color.black);
        jTextFieldName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelDescription.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabelDescription.setForeground(java.awt.Color.black);
        jLabelDescription.setText("Descri????o");

        jLabelDeadline.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabelDeadline.setForeground(java.awt.Color.black);
        jLabelDeadline.setText("Prazo (dd/mm/yyyy)");

        jLabelNotes.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        jLabelNotes.setForeground(java.awt.Color.black);
        jLabelNotes.setText("Notas");

        jTextAreaDescription.setBackground(java.awt.Color.white);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jTextAreaDescription.setForeground(java.awt.Color.black);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextAreaDescription.setPreferredSize(new java.awt.Dimension(244, 90));
        jScrollPaneDescription.setViewportView(jTextAreaDescription);
        jTextAreaDescription.getAccessibleContext().setAccessibleName("");

        jTextAreaNotes.setBackground(java.awt.Color.white);
        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jTextAreaNotes.setForeground(java.awt.Color.black);
        jTextAreaNotes.setRows(5);
        jTextAreaNotes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPaneNotes.setViewportView(jTextAreaNotes);

        jFormattedTextFieldDeadline.setBackground(java.awt.Color.white);
        jFormattedTextFieldDeadline.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldDeadline.setForeground(java.awt.Color.black);
        jFormattedTextFieldDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout jPanelTaskLayout = new javax.swing.GroupLayout(jPanelTask);
        jPanelTask.setLayout(jPanelTaskLayout);
        jPanelTaskLayout.setHorizontalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldName)
                    .addComponent(jLabelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldDeadline))
                .addContainerGap())
        );
        jPanelTaskLayout.setVerticalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPaneloolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPaneloolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jLabelToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolBarSaveMouseClicked
        // TODO add your handling code here:

        try {

            //validando as informa????es
            if (!jTextFieldName.getText().isEmpty() && !jFormattedTextFieldDeadline.
                    getText().isEmpty()) {

                //salvar info dos campos nesse projeto criado e depois enviar tudo ao db
                Task task = new Task();

                //colocando as info das tarefas no id pertencente ao projeto
                task.setIdProject(project.getId());

                //pegar texto dentro do componente
                task.setName(jTextFieldName.getText());
                //pegar texto dentro do componente
                task.setDescription(jTextAreaDescription.getText());
                //pegar texto dentro do componente
                task.setNotes(jTextAreaNotes.getText());
                task.setIsCompleted(false);

                //convertendo a data e guardando
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/y");
                Date deadline = null;
                deadline = dateFormat.parse(jFormattedTextFieldDeadline.getText());
                task.setDeadline(deadline);

                controller.save(task);

                JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane, "A Tarefa n??o foi salva, "
                        + "pois os campos n??o foram preenchidos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jLabelToolBarSaveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadline;
    private javax.swing.JLabel jLabelDeadline;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNotes;
    private javax.swing.JLabel jLabelToolBarSave;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JPanel jPaneloolBar;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JScrollPane jScrollPaneNotes;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    //tarefa pertence a determinado projeto
    public void setProject(Project project) {
        this.project = project;
    }

}
