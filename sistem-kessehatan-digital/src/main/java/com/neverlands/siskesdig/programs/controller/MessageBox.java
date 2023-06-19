/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.neverlands.siskesdig.programs.controller;

import java.awt.Color;

import com.neverlands.siskesdig.programs.LoginRegist;

/**
 *
 * @author Zenith
 */
public class MessageBox extends javax.swing.JFrame {

    

    /**
     * Creates new form MessageBox
     */
    public MessageBox() {
        setUndecorated(true);
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Okay = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/alert.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 160));

        Okay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/alert_button.png"))); // NOI18N
        Okay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkayMouseClicked(evt);
            }
        });
        getContentPane().add(Okay, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 130, -1, -1));

        Text.setBackground(new java.awt.Color(255, 255, 255));
        Text.setFont(new java.awt.Font("Concert One", 0, 20)); // NOI18N
        Text.setForeground(new java.awt.Color(78, 78, 78));
        Text.setText(LoginRegist.getText());
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 290, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/alert.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OkayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkayMouseClicked
        dispose();
    }//GEN-LAST:event_OkayMouseClicked

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
            java.util.logging.Logger.getLogger(MessageBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessageBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessageBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessageBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessageBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Okay;
    public javax.swing.JLabel Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
