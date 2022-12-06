/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.ExamBLL;
import DTO.ExamDTO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quoc An
 */
public class Exam_All extends javax.swing.JPanel {

    ExamBLL examBLL = new ExamBLL();
    /**
     * Creates new form Exam_All
     */
    //get subject in database
    String subject[] = {"All", "Physic", "Math", "Chemistry", "English"};

    public Exam_All() {
        initComponents();
        //subject = { "Physic", "Math", "Chemistry", "English" };
        BufferedImage img = null;
        File f = new File("C:\\Image\\search-icon-2.png");
        try {
            img = ImageIO.read(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        jButton_search.setIcon(imageIcon);
        try {
            listExam();
            //get id while clicked row data
//        Object[] row1 = {"data1", "asdasd", "dasdasdata3", "datasdasda4"};
//        Object[] row2 = {"data2", "asd", "asdasdasd", "asdaqrf"};
//        Object[] row3 = {"data3", "sdfg", "sdfg", "sdfgsdfg"};
//        Object[] row4 = {"data4", "datwera2", "wedata3", "sadf"};
//
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//
//        model.addRow(row1);
//        model.addRow(row2);
//        model.addRow(row3);
//        model.addRow(row4);
        } catch (SQLException ex) {
            Logger.getLogger(Exam_All.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_search = new javax.swing.JButton();
        jComboBox_subject = new javax.swing.JComboBox<>();
        jFormattedTextField_search = new javax.swing.JFormattedTextField();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đề", "Tên đề", "Người tạo", "Môn", "Số câu", "Thời gian làm", "Điểm cao nhất", "Điểm thấp nhất", "Điểm trung bình"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1039;
        gridBagConstraints.ipady = 576;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jButton_search.setBackground(new java.awt.Color(34, 133, 225));
        jButton_search.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton_search.setText("  Find");
        jButton_search.setBorderPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jButton_search, gridBagConstraints);

        jComboBox_subject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_subject.setModel(new javax.swing.DefaultComboBoxModel<>(subject));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 108;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jComboBox_subject, gridBagConstraints);

        jFormattedTextField_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField_searchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 211;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jFormattedTextField_search, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField_searchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        //int column = source.columnAtPoint( evt.getPoint() );
        String s = source.getModel().getValueAt(row, 0) + "";

        JOptionPane.showMessageDialog(null, s);

    }//GEN-LAST:event_jTable1MouseClicked

    void listExam() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        List list = examBLL.LoadExam(1);
        Object[][] data = new Object[list.size()][9];
        for (int i = 0; i < list.size(); i++) {
            ExamDTO e = (ExamDTO) list.get(i);
            Object[] row = {
                e.getExamID(),
                e.getTitle(),
                e.getFullname(),
                e.getSubjectname(),
                e.getNumOfQuiz(),
                e.getTime(),
                e.getHighest(),
                e.getLowest(),
                e.getAvg()
            };
//            data[i][0] = e.getExamID();
//            data[i][1] = e.getTitle();
//            data[i][2] = e.getFullname();
//            data[i][3] = e.getSubjectname();
//            data[i][4] = e.getNumOfQuiz();
//            data[i][5] = e.getTime();
//            data[i][6] = e.getHighest();
//            data[i][7] = e.getLowest();
//            data[i][8] = e.getAvg();
            model.addRow(row);
        }
        jTable1.setModel(model);
    }

//    private DefaultTableModel convertExamList(List list) {
//        String[] columnNames = {"TT", "CourseID", "PersonID"};
//        Object[][] data = new Object[list.size()][3];
//        for (int i = 0; i < list.size(); i++) {
//            ExamDTO e = (ExamDTO) list.get(i);
//            data[i][0] = e.getCourseId();
//            data[i][1] = e.getPersonId();
//        }
//        DefaultTableModel model = new DefaultTableModel(data, columnNames);
//        return model;
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_search;
    private javax.swing.JComboBox<String> jComboBox_subject;
    private javax.swing.JFormattedTextField jFormattedTextField_search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}