/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.Controller;
import BLL.MD5;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author Quoc An
 */
public class ChangePassword extends javax.swing.JFrame {

    private boolean flag = false;
    String Username;
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword(String Username) {
        initComponents();
        this.setTitle("Quiz Exam Change Password");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        jButton_cancel.putClientProperty( "JButton.buttonType", "roundRect" );
        jButton_submit.putClientProperty( "JButton.buttonType", "roundRect" );
        jPassword_Old.putClientProperty( "JComponent.roundRect", true );
        jPassword_Old.putClientProperty( "JTextField.placeholderText","Old Password");
        jPasswordField1.putClientProperty( "JComponent.roundRect", true );
        jPasswordField1.putClientProperty( "JTextField.placeholderText","New Password");
        jPasswordField2.putClientProperty( "JComponent.roundRect", true );
        jPasswordField2.putClientProperty( "JTextField.placeholderText","Confirm New Password");
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(getClass().getResource("/GUI/Image/eye.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        jButton_eye.setIcon(imageIcon);
        this.Username = Username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton_cancel = new javax.swing.JButton();
        jButton_submit = new javax.swing.JButton();
        jButton_eye = new javax.swing.JButton();
        jPassword_Old = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CHANGE PASSWORD");

        jPasswordField1.setPreferredSize(new java.awt.Dimension(250, 40));

        jPasswordField2.setPreferredSize(new java.awt.Dimension(250, 40));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jButton_cancel.setBackground(new java.awt.Color(255, 102, 102));
        jButton_cancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton_cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cancel.setText("Cancel");
        jButton_cancel.setBorderPainted(false);
        jButton_cancel.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jButton_submit.setBackground(new java.awt.Color(34, 133, 225));
        jButton_submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton_submit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_submit.setText("Submit");
        jButton_submit.setBorderPainted(false);
        jButton_submit.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_submitActionPerformed(evt);
            }
        });

        jButton_eye.setBorderPainted(false);
        jButton_eye.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton_eye.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton_eye.setPreferredSize(new java.awt.Dimension(25, 25));
        jButton_eye.setRequestFocusEnabled(false);
        jButton_eye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eyeActionPerformed(evt);
            }
        });

        jPassword_Old.setPreferredSize(new java.awt.Dimension(250, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPassword_Old, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jButton_submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_eye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jPassword_Old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_eye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_submit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_submitActionPerformed
        // TODO add your handling code here:
        if(jPassword_Old.getPassword().length != 0 && jPasswordField1.getPassword().length != 0 && jPasswordField2.getPassword().length != 0){
            Controller controller = new Controller();
            String oldpassword = String.valueOf(jPassword_Old.getPassword());
            String newpassword = String.valueOf(jPasswordField1.getPassword());
            String retypepassword = String.valueOf(jPasswordField2.getPassword());
            if(!newpassword.equals(retypepassword)){
                JOptionPane.showMessageDialog(this, "Password doesn't match! Please retype.");
            if(!Controller.validatePassword(newpassword)){
                JOptionPane.showMessageDialog(this, "Password too weak or invalid!");
            }
            }else{
                String hashOldPass = MD5.getMd5(oldpassword);
                String hashNewPass = MD5.getMd5(newpassword);//hash md5 for password

                Map<String, String> inputMap = new HashMap<String, String>();
                inputMap.put("func", "changePass");//push username to inputMap
                inputMap.put("username", Username);
                inputMap.put("password_old", hashOldPass);//push password hashed to inputMap
                inputMap.put("password_new", hashNewPass);
                inputMap.put("status", "true");
                String data = controller.convertToJSON(inputMap);
                JSONObject json =  new JSONObject(data);
                
                OTP otp = new OTP(json);
                otp.setVisible(true);
                this.dispose();
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Do not leave the password field blank!");
        }
        
    }//GEN-LAST:event_jButton_submitActionPerformed

    private void jButton_eyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eyeActionPerformed
        // TODO add your handling code here:
        if(!flag){
            jPasswordField1.setEchoChar((char)0);
            flag = true;
        }else{
            jPasswordField1.setEchoChar('•');
            flag = false;
        }
    }//GEN-LAST:event_jButton_eyeActionPerformed

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        // TODO add your handling code here:'
        this.dispose();
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        FlatLightLaf.setup();
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ChangePassword().setVisible(true);
//            }
//        });
//    }
    
    public void changePass(String data, Controller controller){
                try {
                    String dataReceive = controller.SendReceiveData(data);
                    System.out.println(dataReceive);
                    JSONObject jsonReceive = new JSONObject(dataReceive);
                    if(jsonReceive.getString("status").equals("true")){
                        JOptionPane.showMessageDialog(this, "Change password success!");
                    }else{
                        JOptionPane.showMessageDialog(this, "Change password fail!");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_eye;
    private javax.swing.JButton jButton_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPassword_Old;
    // End of variables declaration//GEN-END:variables
}