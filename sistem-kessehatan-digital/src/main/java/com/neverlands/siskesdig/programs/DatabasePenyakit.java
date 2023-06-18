package com.neverlands.siskesdig.programs;
import com.neverlands.siskesdig.programs.controller.config;
import java.sql.*;

public class DataBasePenyakit {
    private String inputKode;
    private String inputPenyakit;
    private String inputDeskripsi;
    private String inputGejala;
    
    Connection conn;
    
    public DataBasePenyakit(String inputKode, String inputPenyakit, String inputDeskripsi, String inputGejala) throws SQLException{
        this.conn = DriverManager.getConnection(config.MYSQL_url,config.MYSQL_username ,config.MYSQL_password);
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
