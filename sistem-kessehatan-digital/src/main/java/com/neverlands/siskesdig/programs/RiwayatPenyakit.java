
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
            String column1Value = resultSet.getString("tanggal_diagnosa");
            String column2Value = resultSet.getString("penyakit");

<<<<<<< HEAD

        }


    }
=======
            System.out.println("Tanggal Penyakit : " + column1Value);
            System.out.println("Penyakit : " + column2Value);
        }

        resultSet.close();
        syntax.close();
    }
    
>>>>>>> 99650a4a314e06e4cf78bfbbf0eff790cc6be886
}
