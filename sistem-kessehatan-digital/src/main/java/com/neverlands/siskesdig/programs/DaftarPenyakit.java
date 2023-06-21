package com.neverlands.siskesdig.programs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neverlands.siskesdig.programs.Graphic.DaftarPenyakitForm;
import com.neverlands.siskesdig.programs.controller.MessageBox;

public class DaftarPenyakit extends Mysql {
    
    public DaftarPenyakit(String mysqlUrl, String mysqlUsername, String mysqlPassword) {
        super(mysqlUrl, mysqlUsername, mysqlPassword);
    }
    
    public void showInfo(String nama_penyakit) throws SQLException {
        
        PreparedStatement syntax_cek = conn.prepareStatement("SELECT * FROM penyakit WHERE nama_penyakit = ?");
        syntax_cek.setString(1, nama_penyakit);
        ResultSet hasil = syntax_cek.executeQuery();

        boolean hasil_boolean = hasil.next();

        if (hasil_boolean) {

            while (hasil.next()) {
            String column1Value = hasil.getString("deskripsi_penyakit");
            String column2Value = hasil.getString("gejala_penyakit");

            DaftarPenyakitForm.jTextArea1.setText(column1Value);
            DaftarPenyakitForm.jTextArea2.setText(column2Value);

            }

        } else {

            String newtext = "Mohon lebih spesifik!";
            MessageBox messageBox = new MessageBox();
            messageBox.messageinfo(newtext);
            messageBox.setVisible(true);

        }

    }
    
}
