package com.neverlands.siskesdig.programs;

public class MainmenuForm extends javax.swing.JFrame {

    /**
     * Creates new form MainmenuForm
     */
    public MainmenuForm() {
        initComponents();
    }

    private void initComponents() {

        User = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        More = new javax.swing.JLabel();
        RiwayatPenyakit = new javax.swing.JLabel();
        DatabasePenyakit = new javax.swing.JLabel();
        HubungiDokter = new javax.swing.JLabel();
        DaftarPenyakit = new javax.swing.JLabel();
        DiagnosaPenyakit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.setFont(new java.awt.Font("Concert One", 0, 35)); // NOI18N
        User.setForeground(new java.awt.Color(47, 143, 38));
        User.setText("User");
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, 60));

        jLabel4.setFont(new java.awt.Font("Concert One", 0, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 124, 136));
        jLabel4.setText("Selamat Datang,");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 250, 60));

        More.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        More.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/more.png"))); // NOI18N
        getContentPane().add(More, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 80, 50));

        RiwayatPenyakit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RiwayatPenyakit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Riwayat_Penyakit.png"))); // NOI18N
        getContentPane().add(RiwayatPenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 440, 150));

        DatabasePenyakit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DatabasePenyakit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Database_Penyakit.png"))); // NOI18N
        getContentPane().add(DatabasePenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 230, 200));

        HubungiDokter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HubungiDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Hubungi_Dokter.png"))); // NOI18N
        getContentPane().add(HubungiDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 230, 200));

        DaftarPenyakit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DaftarPenyakit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Daftar_Penyakit.png"))); // NOI18N
        getContentPane().add(DaftarPenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 220, 200));

        DiagnosaPenyakit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiagnosaPenyakit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Diagnosa_Penyakit.png"))); // NOI18N
        DiagnosaPenyakit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiagnosaPenyakitMouseClicked(evt);
            }
        });
        getContentPane().add(DiagnosaPenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 196, 210, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/neverlands/siskesdig/bin/Main_Menu.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiagnosaPenyakitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiagnosaPenyakitMouseClicked

    }//GEN-LAST:event_DiagnosaPenyakitMouseClicked

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
    private javax.swing.JLabel DaftarPenyakit;
    private javax.swing.JLabel DatabasePenyakit;
    private javax.swing.JLabel DiagnosaPenyakit;
    private javax.swing.JLabel HubungiDokter;
    private javax.swing.JLabel More;
    private javax.swing.JLabel RiwayatPenyakit;
    private javax.swing.JLabel User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
