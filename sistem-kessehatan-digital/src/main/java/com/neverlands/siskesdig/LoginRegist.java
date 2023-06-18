package com.neverlands.siskesdig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRegist {

    static final String mysql_url = "jdbc:mysql://51.161.134.32/sistem_kesehatan";
    static final String username = "database_pbo";
    static final String password = "pbo331";
    
    private String inputUsername;
    private String inputPassword;
    
    Connection conn;
    
    public LoginRegist(String inputUsername, String inputPassword) throws SQLException{
        this.conn = DriverManager.getConnection(mysql_url, username, password);
        this.inputUsername = inputUsername;
        this.inputPassword = inputPassword;
    }
    
    public void login() throws SQLException{
        PreparedStatement syntax = conn.prepareStatement("SELECT * FROM akun WHERE username = ? AND password = ?");
        syntax.setString(1, inputUsername);
        syntax.setString(2, inputPassword);
        ResultSet hasil = syntax.executeQuery();
        Boolean status_login = hasil.next();

        if (status_login) {

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Selamat datang " + inputUsername);


        } else {

            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.println("Login gagal, Silahkan cek username dan password kembali!");

            return;

        }
    }
    
    public void register() throws SQLException{
        PreparedStatement syntax = conn.prepareStatement("INSERT INTO akun (username, password) VALUES (?, ?)");
        syntax.setString(1, inputUsername);
        syntax.setString(2, inputPassword);
        syntax.executeUpdate();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Akun berhasil dibuat, silahkan login!");
    }
}

