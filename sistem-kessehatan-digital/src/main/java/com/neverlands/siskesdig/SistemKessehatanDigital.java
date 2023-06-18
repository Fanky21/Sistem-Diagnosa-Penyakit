/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.neverlands.siskesdig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SistemKessehatanDigital {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(Main.mysql_url, Main.username, Main.password);
            System.out.println("Koneksi berhasil!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Koneksi gagal!");
            e.printStackTrace();
        }
    }
}
