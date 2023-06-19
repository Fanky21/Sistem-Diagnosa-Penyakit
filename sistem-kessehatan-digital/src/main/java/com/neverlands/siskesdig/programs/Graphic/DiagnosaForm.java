/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.neverlands.siskesdig.programs.Graphic;

import java.sql.SQLException;
import java.util.List;

import com.neverlands.siskesdig.programs.DiagnosaPenyakit;
import java.awt.Color;

/**
 *
 * @author Fakhrizal
 */
public class DiagnosaForm extends javax.swing.JFrame {

    /**
     * Creates new form DiagnosaForm
     */
    public DiagnosaForm() {
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

        jTextField1 = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Penyakit2 = new javax.swing.JLabel();
        Penyakit3 = new javax.swing.JLabel();
        Penyakit1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 216, 290, 55));

        Search.setIcon(new javax.swing.ImageIcon("F:\\ITK\\Semester 2\\PBO\\new\\Sistem-Diagnosa-Penyakit\\sistem-kessehatan-digital\\src\\main\\java\\com\\neverlands\\siskesdig\\bin\\Search.png")); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 213, 60, 60));

        Back.setIcon(new javax.swing.ImageIcon("F:\\ITK\\Semester 2\\PBO\\new\\Sistem-Diagnosa-Penyakit\\sistem-kessehatan-digital\\src\\main\\java\\com\\neverlands\\siskesdig\\bin\\Back.png")); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 35, 60, 60));

        Penyakit2.setBackground(new java.awt.Color(255, 255, 255));
        Penyakit2.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        Penyakit2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Penyakit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 370, 50));

        Penyakit3.setBackground(new java.awt.Color(255, 255, 255));
        Penyakit3.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        Penyakit3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Penyakit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 370, 50));

        Penyakit1.setBackground(new java.awt.Color(255, 255, 255));
        Penyakit1.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        Penyakit1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Penyakit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 370, 50));

        Background.setIcon(new javax.swing.ImageIcon("F:\\ITK\\Semester 2\\PBO\\new\\Sistem-Diagnosa-Penyakit\\sistem-kessehatan-digital\\src\\main\\java\\com\\neverlands\\siskesdig\\bin\\Diagnosa_Penyakit2.png")); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        MainmenuForm MainmenuForm = new MainmenuForm();
        MainmenuForm.setVisible(true);

        dispose();

    }//GEN-LAST:event_BackMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        // TODO add your handling code here:
        try {
        // Buat instance objek DiagnosaPenyakit
        DiagnosaPenyakit diagnosa = new DiagnosaPenyakit("jdbc:mysql://51.161.134.32/sistem_kesehatan", "database_pbo", "pbo331", "username");

        // Terhubung ke database
        diagnosa.connectToDatabase();

        // Ambil kalimat untuk diagnostik dari suatu sumber input, misalnya JTextField bernama inputTextField
        String kalimat = jTextField1.getText();

        // Jalankan diagnosa
        List<String> penyakitList = diagnosa.StartDiagnosa(kalimat);

        // Tampilkan hasil diagnosa pada label Penyakit 1, Penyakit 2, dan Penyakit 3
        if (penyakitList.size() >= 1) {
            Penyakit1.setText(penyakitList.get(0));
        }
        if (penyakitList.size() >= 2) {
            Penyakit2.setText(penyakitList.get(1));
        }
        if (penyakitList.size() >= 3) {
            Penyakit3.setText(penyakitList.get(2));
        }

        // Tutup koneksi ke database
        diagnosa.closeConnection();
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Handle exception
    }
        
    }//GEN-LAST:event_SearchMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(DiagnosaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnosaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnosaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnosaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Penyakit1;
    private javax.swing.JLabel Penyakit2;
    private javax.swing.JLabel Penyakit3;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
