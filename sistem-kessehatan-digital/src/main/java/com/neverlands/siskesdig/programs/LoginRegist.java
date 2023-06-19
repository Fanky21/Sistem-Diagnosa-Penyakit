package com.neverlands.siskesdig.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.neverlands.siskesdig.programs.Graphic.MainmenuForm;
import com.neverlands.siskesdig.programs.Graphic.RegisterForm;
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

                MainmenuForm MainmenuForm = new MainmenuForm();
                MainmenuForm.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Username/Password Salah!", "Login failed!", 1, null);

            }

        }


    
    public void register(String Username, String Password) throws SQLException{

        if (RegisterForm.getUsername().equals("")) {

            JOptionPane.showMessageDialog(null,"Username Tidak Boleh Kosong!" , "Error!",1,null);

        } else if (RegisterForm.getUsername().equals("Username")) {

            JOptionPane.showMessageDialog(null,"Username Tidak Boleh Kosong!" , "Error!",1,null);

        } else if (RegisterForm.getPassword().equals("")){

            JOptionPane.showMessageDialog(null,"Password Tidak Boleh Kosong!" , "Error!",1,null);

        } else if (RegisterForm.getPassword().equals("Password")){
            
            JOptionPane.showMessageDialog(null,"Password Tidak Boleh Kosong!" , "Error!",1,null);

        } else {
            
            PreparedStatement syntax = conn.prepareStatement("SELECT * FROM akun WHERE username = ? AND password = ?");
            syntax.setString(1, Username);
            syntax.setString(2, Password);
            ResultSet akun = syntax.executeQuery();
            Boolean cek_akun = akun.next();

            if (cek_akun) {

                JOptionPane.showMessageDialog(null,"Username Telah Digunakan!" , "Error!",1,null);

            } else {

                PreparedStatement syntax1 = conn.prepareStatement("INSERT INTO akun (username, password) VALUES (?, ?)");
                syntax1.setString(1, Username);
                syntax1.setString(2, Password);
                syntax1.executeUpdate();

                JOptionPane.showMessageDialog(null,"Akun berhasil dibuat! " + Username , "Success!",1,null);
                }
        }
    }
}

