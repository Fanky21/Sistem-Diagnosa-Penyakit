/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.neverlands.siskesdig.programs.Graphic;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.neverlands.siskesdig.programs.DatabasePenyakit;



/**
 *
 * @author Idin
 */
public class DatabasePenyakitForm extends javax.swing.JFrame{
    /**
     * Creates new form DatabasePenyakitForm
     */

    private int xOffset;
    private int yOffset;

    public DatabasePenyakitForm() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nama_Penyakit = new javax.swing.JTextField();
        Gejala = new javax.swing.JTextField();
        Delete = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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

        Nama_Penyakit.setBackground(new java.awt.Color(255, 255, 255));
        Nama_Penyakit.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        Nama_Penyakit.setForeground(new java.awt.Color(0, 0, 0));
        Nama_Penyakit.setBorder(null);
        Nama_Penyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_PenyakitActionPerformed(evt);
            }
        });
        getContentPane().add(Nama_Penyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 112, 320, 30));

        Gejala.setBackground(new java.awt.Color(255, 255, 255));
        Gejala.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        Gejala.setForeground(new java.awt.Color(0, 0, 0));
        Gejala.setBorder(null);
        Gejala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GejalaActionPerformed(evt);
            }
        });
        getContentPane().add(Gejala, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 185, 320, 30));

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Delete.png"))); // NOI18N
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, -1, -1));

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Add.png"))); // NOI18N
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Back.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 34, -1, 60));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setLineWrap(true); // Mengatur agar teks pindah baris
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);

        jScrollPane1.setViewportView(jTextArea1); // Menambahkan jTextArea1 ke dalam jScrollPane1
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 310, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Database Penyakit1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 310, 200));

        pack();
        setLocationRelativeTo(null);
    }

        private String generateRandomCode() {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder sb = new StringBuilder();
            Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();


    }// </editor-fold>//GEN-END:initComponents

    private void Nama_PenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_PenyakitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_PenyakitActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        MainmenuForm MainmenuForm = new MainmenuForm();
        MainmenuForm.setVisible(true);

        dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here
        String inputKode = generateRandomCode(); // Isi dengan kode yang sesuai
        String inputPenyakit = Nama_Penyakit.getText();
        String inputDeskripsi = jTextArea1.getText();
        String inputGejala = Gejala.getText();

    try {

        DatabasePenyakit penyakit = new DatabasePenyakit(inputKode, inputPenyakit, inputDeskripsi, inputGejala);
        
        penyakit.add();
        
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);

        Timer timer = new Timer();

                timer.schedule(new TimerTask() {
                @Override
                public void run() {
                jLabel3.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                }
            }, 3000);
        
        // Reset
        Nama_Penyakit.setText("");
        jTextArea1.setText("");
        Gejala.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        }//GEN-LAST:event_AddMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:

        String inputPenyakit = Nama_Penyakit.getText();

        try {

        DatabasePenyakit penyakit = new DatabasePenyakit(inputPenyakit, inputPenyakit, inputPenyakit, inputPenyakit);
        
        penyakit.delete();
        
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);

        Timer timer = new Timer();

                timer.schedule(new TimerTask() {
                @Override
                public void run() {
                jLabel3.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                }
            }, 3000);
        
        // Reset
        Nama_Penyakit.setText("");
        jTextArea1.setText("");
        Gejala.setText("");

    } catch (SQLException ex) {

        ex.printStackTrace();

    }
    }//GEN-LAST:event_DeleteMouseClicked

    private void GejalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GejalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GejalaActionPerformed

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
            java.util.logging.Logger.getLogger(DatabasePenyakitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatabasePenyakitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatabasePenyakitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabasePenyakitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabasePenyakitForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Delete;
    private javax.swing.JTextField Gejala;
    private javax.swing.JTextField Nama_Penyakit;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
