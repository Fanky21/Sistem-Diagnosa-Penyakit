
package com.neverlands.siskesdig.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RiwayatPenyakit extends Mysql {

    private static Connection conn;
    
    public RiwayatPenyakit(String inputKode, String inputPenyakit, String inputDeskripsi, String inputGejala) throws SQLException {
        super(inputKode, inputPenyakit, inputDeskripsi);
    }
    
    public void showInfo() throws SQLException {
        connectToDatabase();
        
        String username = "username";

        PreparedStatement syntax = conn.prepareStatement("SELECT * FROM riwayat_penyakit WHERE username = ?");
        syntax.setString(1, username);
        ResultSet resultSet = syntax.executeQuery();

        while (resultSet.next()) {
            // Retrieve values from each row
            String column1Value = resultSet.getString("tanggal_diagnosa");
            String column2Value = resultSet.getString("penyakit");


        }


    }
}
