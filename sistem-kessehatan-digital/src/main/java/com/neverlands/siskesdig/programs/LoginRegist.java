package com.neverlands.siskesdig.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.neverlands.siskesdig.programs.Graphic.LoginForm;
import com.neverlands.siskesdig.programs.Graphic.MainmenuForm;
import com.neverlands.siskesdig.programs.controller.config;

public class LoginRegist {

    private Connection conn;
    private String Username;
    private String Password;
    
    public LoginRegist() throws SQLException{
        this.conn = DriverManager.getConnection(config.MYSQL_url, config.MYSQL_username, config.MYSQL_password);
    }
    
    public void login(String Username, String Password) throws SQLException, InterruptedException{
        PreparedStatement syntax = conn.prepareStatement("SELECT * FROM akun WHERE username = ? AND password = ?");
        syntax.setString(1, Username);
        syntax.setString(2, Password);
        ResultSet hasil = syntax.executeQuery();
        Boolean status_login = hasil.next();

        if (status_login) {

            JOptionPane.showMessageDialog(null, null);

            SwingUtilities.invokeLater(() -> {
                MainmenuForm mainmenuForm = new MainmenuForm();
                mainmenuForm.setVisible(true);

            });

        } else {

            JOptionPane.showMessageDialog(null, "FAILED, FATAL ERROR!", "Login failed!", 1, null);

        }
    }
    
    public void register(String Username, String Password) throws SQLException{
        PreparedStatement syntax = conn.prepareStatement("INSERT INTO akun (username, password) VALUES (?, ?)");
        syntax.setString(1, Username);
        syntax.setString(2, Password);
        syntax.executeUpdate();

        JOptionPane.showMessageDialog(null,"Akun berhasil dibuat!" + Username , "Success!",1,null);
    }

}

