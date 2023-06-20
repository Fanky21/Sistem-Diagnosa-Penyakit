
package com.neverlands.siskesdig.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

<<<<<<< HEAD
public class RiwayatPenyakit extends Mysql {
=======
import com.neverlands.siskesdig.programs.controller.config;

public class RiwayatPenyakit extends DatabasePenyakit {
>>>>>>> 4fbd00ddcaabb468dc1f61068260e5518129c7e5

    private static Connection conn;

    public RiwayatPenyakit(String inputKode, String inputPenyakit, String inputDeskripsi, String inputGejala) throws SQLException {
        super(inputKode, inputPenyakit, inputDeskripsi);
    }
<<<<<<< HEAD
    
    public void showInfo() throws SQLException {
        connectToDatabase();
        
        String username = "username";
=======

    public void showInfo(String username) throws SQLException {

        conn = DriverManager.getConnection(config.MYSQL_url, config.MYSQL_username, config.MYSQL_password);
>>>>>>> 4fbd00ddcaabb468dc1f61068260e5518129c7e5

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
    
>>>>>>> 4fbd00ddcaabb468dc1f61068260e5518129c7e5
}
