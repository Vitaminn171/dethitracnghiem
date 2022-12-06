/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 *
 * @author Quoc An
 */
public class Exam extends javax.swing.JFrame {

    /**
     * Creates new form Exam
     */
    
    public ButtonGroup G;
    public Exam() {
        initComponents();
        this.setTitle("Quiz Exam");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        // set the time with "limit time" and countdown
        
        jButton_next.putClientProperty( "JButton.buttonType", "roundRect" );
        jButton_next.putClientProperty( "JButton.focusWidth", 1 );
        jButton_prev.putClientProperty( "JButton.buttonType", "roundRect" );
        jButton_prev.putClientProperty( "JButton.focusWidth", 1 );
        jButton_finish.putClientProperty( "JButton.buttonType", "roundRect" );
        jButton_finish.putClientProperty( "JButton.focusWidth", 1 );
        
        jRadioButton_answer_1.setActionCommand("A");
        jRadioButton_answer_2.setActionCommand("B");
        jRadioButton_answer_3.setActionCommand("C");
        jRadioButton_answer_4.setActionCommand("D");
        
        G = new ButtonGroup();
        G.add(jRadioButton_answer_1);
        G.add(jRadioButton_answer_2);
        G.add(jRadioButton_answer_3);
        G.add(jRadioButton_answer_4);
        
        // if (time == 0)
        //      then finish quiz and save all the answer
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton_answer_1 = new javax.swing.JRadioButton();
        jRadioButton_answer_2 = new javax.swing.JRadioButton();
        jRadioButton_answer_3 = new javax.swing.JRadioButton();
        jRadioButton_answer_4 = new javax.swing.JRadioButton();
        jButton_prev = new javax.swing.JButton();
        jButton_next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton_finish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Question ?:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 42, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Question ......................");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 706;
        gridBagConstraints.ipady = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 42, 0, 42);
        getContentPane().add(jLabel2, gridBagConstraints);

        jRadioButton_answer_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_answer_1.setText("A");
        jRadioButton_answer_1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jRadioButton_answer_1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton_answer_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_answer_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 42, 0, 42);
        getContentPane().add(jRadioButton_answer_1, gridBagConstraints);

        jRadioButton_answer_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_answer_2.setText("B");
        jRadioButton_answer_2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jRadioButton_answer_2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton_answer_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_answer_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 42, 0, 42);
        getContentPane().add(jRadioButton_answer_2, gridBagConstraints);

        jRadioButton_answer_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_answer_3.setText("C");
        jRadioButton_answer_3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jRadioButton_answer_3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton_answer_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_answer_3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 42, 0, 42);
        getContentPane().add(jRadioButton_answer_3, gridBagConstraints);

        jRadioButton_answer_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_answer_4.setText("D");
        jRadioButton_answer_4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jRadioButton_answer_4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton_answer_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_answer_4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 42, 0, 42);
        getContentPane().add(jRadioButton_answer_4, gridBagConstraints);

        jButton_prev.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_prev.setText("Previous");
        jButton_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_prevActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 42, 31, 0);
        getContentPane().add(jButton_prev, gridBagConstraints);

        jButton_next.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_next.setText("Next");
        jButton_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 31, 0);
        getContentPane().add(jButton_next, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Time : 00.00.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 481, 0, 42);
        getContentPane().add(jLabel3, gridBagConstraints);

        jButton_finish.setBackground(new java.awt.Color(255, 255, 102));
        jButton_finish.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_finish.setForeground(new java.awt.Color(51, 51, 51));
        jButton_finish.setText("Finish");
        jButton_finish.setBorderPainted(false);
        jButton_finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_finishActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 491, 31, 42);
        getContentPane().add(jButton_finish, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_answer_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_answer_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_answer_3ActionPerformed

    private void jRadioButton_answer_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_answer_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_answer_4ActionPerformed

    private void jRadioButton_answer_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_answer_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_answer_2ActionPerformed

    private void jButton_finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_finishActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
        //save all the answer and package it
        //then push it to server to check the answer
        
        
        
        
        
        //return to show result
        Result result = new Result();
        result.setVisible(true);
        this.dispose();
        //set data to label
    }//GEN-LAST:event_jButton_finishActionPerformed

    private void jButton_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nextActionPerformed
        // TODO add your handling code here:
        
        //save selection of the question
        System.out.println(G.getSelection().getActionCommand());
        
        //then push next question in the label and radion button, num of question
        G.clearSelection();
        jRadioButton_answer_1.setText("");
        jRadioButton_answer_2.setText("");
        jRadioButton_answer_3.setText("");
        jRadioButton_answer_4.setText("");
        
    }//GEN-LAST:event_jButton_nextActionPerformed

    private void jRadioButton_answer_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_answer_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_answer_1ActionPerformed

    private void jButton_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_prevActionPerformed
        // TODO add your handling code here:
        
        //save selection of the question
        System.out.println(G.getSelection().getActionCommand());
        
        //then push previous question in the label and radion button, num of question
        G.clearSelection();
        jRadioButton_answer_1.setText("");
        jRadioButton_answer_2.setText("");
        jRadioButton_answer_3.setText("");
        jRadioButton_answer_4.setText("");
    }//GEN-LAST:event_jButton_prevActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_finish;
    private javax.swing.JButton jButton_next;
    private javax.swing.JButton jButton_prev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton_answer_1;
    private javax.swing.JRadioButton jRadioButton_answer_2;
    private javax.swing.JRadioButton jRadioButton_answer_3;
    private javax.swing.JRadioButton jRadioButton_answer_4;
    // End of variables declaration//GEN-END:variables
}