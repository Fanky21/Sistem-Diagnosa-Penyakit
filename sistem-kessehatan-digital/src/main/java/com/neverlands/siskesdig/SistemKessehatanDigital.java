/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.neverlands.siskesdig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Zenith
 */
public class SistemKessehatanDigital {

    private static final String url = "jdbc:mysql://51.161.134.32/sistem_kesehatan";
    private static final String username = "database_pbo";
    private static final String password = "pbo331";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi berhasil!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Koneksi gagal!");
            e.printStackTrace();
        }
    }
}
