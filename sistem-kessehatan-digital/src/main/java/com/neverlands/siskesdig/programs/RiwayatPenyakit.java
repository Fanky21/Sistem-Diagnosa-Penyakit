
package com.neverlands.siskesdig.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neverlands.siskesdig.programs.controller.config;

public class RiwayatPenyakit extends DatabasePenyakit {

    private static Connection conn;

    public RiwayatPenyakit(String inputKode, String inputPenyakit, String inputDeskripsi, String inputGejala) throws SQLException {
        super(inputKode, inputPenyakit, inputDeskripsi, inputGejala);
    }

    public void showInfo(String username) throws SQLException {

        conn = DriverManager.getConnection(config.MYSQL_url, config.MYSQL_username, config.MYSQL_password);

        PreparedStatement syntax = conn.prepareStatement("SELECT * FROM riwayat_penyakit WHERE username = ?");
        syntax.setString(1, username);
        ResultSet resultSet = syntax.executeQuery();

        while (resultSet.next()) {
            String column1Value = resultSet.getString("tanggal_diagnosa");
            String column2Value = resultSet.getString("penyakit");

            System.out.println("Tanggal Penyakit : " + column1Value);
            System.out.println("Penyakit : " + column2Value);
        }

        resultSet.close();
        syntax.close();
    }
    
}
