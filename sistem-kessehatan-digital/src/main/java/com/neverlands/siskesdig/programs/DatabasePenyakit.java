package com.neverlands.siskesdig.programs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.neverlands.siskesdig.programs.controller.Config;

public class DatabasePenyakit {
    private String inputKode;
    private String inputPenyakit;
    private String inputDeskripsi;
    private String inputGejala;
    
    Connection conn;
    
    public DatabasePenyakit(String inputKode, String inputPenyakit, String inputDeskripsi, String inputGejala) throws SQLException{
        this.conn = DriverManager.getConnection(Config.MYSQL_url,Config.MYSQL_username ,Config.MYSQL_password);
        this.inputKode = inputKode;
        this.inputPenyakit = inputPenyakit;
        this.inputDeskripsi = inputDeskripsi;
        this.inputGejala = inputGejala;
    }
    
    public void add() throws SQLException{
        PreparedStatement syntax = conn.prepareStatement("INSERT INTO penyakit (kode_penyakit, nama_penyakit, deskripsi_penyakit, gejala_penyakit) VALUES (?, ?, ?, ?)");
        syntax.setString(1, inputKode);
        syntax.setString(2, inputPenyakit);
        syntax.setString(3, inputDeskripsi);
        syntax.setString(4, inputGejala);
        syntax.executeUpdate();

    }
    
    public void delete() throws SQLException{
        PreparedStatement deleteSyntax = conn.prepareStatement("DELETE FROM penyakit WHERE nama_penyakit = ?");
        deleteSyntax.setString(1, inputPenyakit);
        deleteSyntax.executeUpdate();
    }
}
