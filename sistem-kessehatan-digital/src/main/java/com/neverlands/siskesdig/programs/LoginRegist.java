package com.neverlands.siskesdig.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.neverlands.siskesdig.programs.controller.config;

public class LoginRegist {

    private Connection conn;
    private String Username;
    private String Password;
    
    public LoginRegist() throws SQLException{
        this.conn = DriverManager.getConnection(config.MYSQL_url, config.MYSQL_username, config.MYSQL_password);
    }
    
    public void login(String Username, String Password) throws SQLException{
        PreparedStatement syntax = conn.prepareStatement("SELECT * FROM akun WHERE username = ? AND password = ?");
        syntax.setString(1, Username);
        syntax.setString(2, Password);
        ResultSet hasil = syntax.executeQuery();
        Boolean status_login = hasil.next();

        if (status_login) {

            JOptionPane.showMessageDialog(null,"Selamat Datang " + Username , "Login success!",1,null);

        } else {

            JOptionPane.showMessageDialog(null, "FAILED, FATAL ERROR!", "Login failed!", 1, null);

        }
    }
    
    public void register() throws SQLException{
        PreparedStatement syntax = conn.prepareStatement("INSERT INTO akun (username, password) VALUES (?, ?)");
        syntax.setString(1, Username);
        syntax.setString(2, Password);
        syntax.executeUpdate();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Akun berhasil dibuat, silahkan login!");
    }
}

