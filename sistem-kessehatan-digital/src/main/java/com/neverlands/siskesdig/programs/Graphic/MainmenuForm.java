/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.neverlands.siskesdig.programs.Graphic;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.neverlands.siskesdig.programs.DiagnosaPenyakit;

/**
 *
 * @author Fakhrizal
 */
public class MainmenuForm extends javax.swing.JFrame {

    private int xOffset;
    private int yOffset;

    /**
     * Creates new form MainmenuForm
     */
    public MainmenuForm() {
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User = new javax.swing.JLabel();
        Selamat1 = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        DiagnosaP = new javax.swing.JLabel();
        DaftarP = new javax.swing.JLabel();
        HubungiD = new javax.swing.JLabel();
        DatabaseP = new javax.swing.JLabel();
        RiwayatP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.setFont(new java.awt.Font("Concert One", 0, 35)); // NOI18N
        User.setForeground(new java.awt.Color(47, 143, 38));
        User.setText("User");
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 240, 50));

        Selamat1.setFont(new java.awt.Font("Concert One", 0, 35)); // NOI18N
        Selamat1.setForeground(new java.awt.Color(82, 124, 136));
        Selamat1.setText("Selamat Datang,");
        getContentPane().add(Selamat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 310, 60));

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Logout.png"))); // NOI18N
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        DiagnosaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Diagnosa_Penyakit.png"))); // NOI18N
        DiagnosaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiagnosaPMouseClicked(evt);
            }
        });
        getContentPane().add(DiagnosaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        DaftarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Daftar_Penyakit.png"))); // NOI18N
        DaftarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DaftarPMouseClicked(evt);
            }
        });
        getContentPane().add(DaftarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        HubungiD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Hubungi_Dokter.png"))); // NOI18N
        HubungiD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HubungiDMouseClicked(evt);
            }
        });
        getContentPane().add(HubungiD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        DatabaseP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Database_Penyakit.png"))); // NOI18N
        DatabaseP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatabasePMouseClicked(evt);
            }
        });
        getContentPane().add(DatabaseP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        RiwayatP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Riwayat_Penyakit.png"))); // NOI18N
        getContentPane().add(RiwayatP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Main_Menu1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        LoginForm LoginForm = new LoginForm();
        LoginForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void DatabasePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabasePMouseClicked
        // TODO add your handling code here:
        DatabasePenyakitForm DatabasePenyakitForm = new DatabasePenyakitForm();
        DatabasePenyakitForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_DatabasePMouseClicked

    private void HubungiDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HubungiDMouseClicked
        // TODO add your handling code here:
        HubungiDokterForm HubungiDokterForm = new HubungiDokterForm();
        HubungiDokterForm.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_HubungiDMouseClicked

    private void DiagnosaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiagnosaPMouseClicked
        // TODO add your handling code here:
        DiagnosaForm DiagnosaForm = new DiagnosaForm();
        DiagnosaForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_DiagnosaPMouseClicked

    private void DaftarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DaftarPMouseClicked
        // TODO add your handling code here:
        DaftarPenyakitForm DaftarPenyakitForm = new DaftarPenyakitForm();
        DaftarPenyakitForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_DaftarPMouseClicked

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
            java.util.logging.Logger.getLogger(MainmenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainmenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainmenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainmenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainmenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DaftarP;
    private javax.swing.JLabel DatabaseP;
    private javax.swing.JLabel DiagnosaP;
    private javax.swing.JLabel HubungiD;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel RiwayatP;
    private javax.swing.JLabel Selamat1;
    private javax.swing.JLabel User;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
