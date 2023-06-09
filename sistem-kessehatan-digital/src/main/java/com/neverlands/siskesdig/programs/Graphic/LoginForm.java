/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.neverlands.siskesdig.programs.Graphic;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

import com.neverlands.siskesdig.programs.SystemLogin;

public class LoginForm extends javax.swing.JFrame {
    private int xOffset;
    private int yOffset;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        setUndecorated(true);
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));

        // Tambahkan mouse listener pada JFrame
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Dapatkan koordinat awal saat tombol mouse ditekan
                xOffset = e.getX();
                yOffset = e.getY();
            }
        });

        // Tambahkan mouse motion listener pada JFrame
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Hitung perubahan koordinat saat mouse digeser
                int newX = getLocation().x + e.getX() - xOffset;
                int newY = getLocation().y + e.getY() - yOffset;

                // Set posisi baru untuk JFrame
                setLocation(newX, newY);
            }
        });

        inputUsername = this.inputUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputPassword = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/LoadingSuccess.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Ellipse 3.png"))); // NOI18
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/LoadingSplash2.png"))); // NOI18N
        jLabel3.setText("jLabel4");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);

        inputUsername.setBackground(new java.awt.Color(255, 255, 255));
        inputUsername.setFont(new java.awt.Font("Concert One", 0, 35)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(0, 0, 0));
        inputUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputUsername.setText("Username");
        inputUsername.setToolTipText("");
        inputUsername.setBorder(null);
        inputUsername.setCaretColor(new java.awt.Color(0, 0, 0));
        inputUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputUsernameFocusLost(evt);
            }
        });
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 270, 40));

        inputPassword.setBackground(new java.awt.Color(255, 255, 255));
        inputPassword.setFont(new java.awt.Font("Concert One", 0, 35)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(0, 0, 0));
        inputPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPassword.setText("Password");
        inputPassword.setBorder(null);
        inputPassword.setCaretColor(new java.awt.Color(0, 0, 0));
        inputPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPasswordFocusLost(evt);
            }
        });
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 280, 50));

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Loginbttn.png"))); // NOI18N
        Login.setBorder(null);
        Login.setToolTipText(null);
        Login.setBorderPainted(false);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    LoginActionPerformed(evt);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 300, 60));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/exit.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/create_one.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Login1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, InterruptedException {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:

            String Username = inputUsername.getText();
            String Password = inputPassword.getText();
            SystemLogin loginRegist = new SystemLogin("jdbc:mysql://51.161.134.32/sistem_kesehatan", "database_pbo", "pbo331");

            try {
                loginRegist.login(Username, Password);

                Timer timer = new Timer();

                timer.schedule(new TimerTask() {
                @Override
                public void run() {
                dispose();
                }
            }, 3000);
                
            } catch (SQLException e) {
                // Handle any exceptions
                e.printStackTrace();
            }
    }//GEN-LAST:event_LoginActionPerformed


    private void inputUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUsernameFocusGained
        if(inputUsername.getText().equals("Username")){
            inputUsername.setText("");
            inputUsername.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputUsernameFocusGained

    private void inputUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputUsernameFocusLost
        if(inputUsername.getText().equals("")){
            inputUsername.setText("Username");
            inputUsername.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputUsernameFocusLost

    private void inputPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPasswordFocusGained
        // TODO add your handling code here:
        if(inputPassword.getText().equals("Password")){
            inputPassword.setText("");
            inputPassword.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputPasswordFocusGained

    private void inputPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPasswordFocusLost
        // TODO add your handling code here:
        if(inputPassword.getText().equals("")){
            inputPassword.setText("Password");
            inputPassword.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_inputPasswordFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        RegisterForm RegisterForm = new RegisterForm();
        RegisterForm.setVisible(true);

        dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked
    
    public static String getUsername(){
        return inputUsername.getText();
    }


    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JButton Login;
    private javax.swing.JTextField inputPassword;
    private static javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}