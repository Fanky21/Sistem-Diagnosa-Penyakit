package com.neverlands.siskesdig.programs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

import com.neverlands.siskesdig.programs.Graphic.LoginForm;
import com.neverlands.siskesdig.programs.Graphic.MainmenuForm;
import com.neverlands.siskesdig.programs.Graphic.RegisterForm;
import com.neverlands.siskesdig.programs.controller.MessageBox;

public class SystemLogin extends Mysql {

    private static String newtext;

    public SystemLogin(String mysqlUrl, String mysqlUsername, String mysqlPassword) {
        super(mysqlUrl, mysqlUsername, mysqlPassword);
    }

    public void login(String Username, String Password) throws SQLException {

        connectToDatabase();

        PreparedStatement syntax = conn.prepareStatement("SELECT * FROM akun WHERE username = ? AND password = ?");
        syntax.setString(1, Username);
        syntax.setString(2, Password);
        ResultSet hasil = syntax.executeQuery();
        Boolean status_login = hasil.next();

        if (status_login) {
            LoginForm.jLabel3.setVisible(true);
            LoginForm.jLabel4.setVisible(true);
            LoginForm.jLabel5.setVisible(true);

            Timer timer = new Timer();

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    MainmenuForm mainmenuForm = new MainmenuForm();
                    mainmenuForm.setVisible(true);
                }
            }, 3000);

        } else {
            newtext = "Username atau password salah!";

            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
            MessageBox messageBox = new MessageBox();
            messageBox.messageinfo(newtext);
            messageBox.setVisible(true);
        }

        closeConnection();
    }

    public static String getText() {
        return newtext;
    }

    public void register(String username, String password) throws SQLException {

        if (RegisterForm.getUsername().equals("") || (RegisterForm.getUsername().equals("Username"))) {

            newtext = "Username Tidak Boleh Kosong!";
            MessageBox messageBox = new MessageBox();
            messageBox.messageinfo(newtext);
            messageBox.setVisible(true);

        } else if (RegisterForm.getPassword().equals("") || (RegisterForm.getPassword().equals("Password"))) {

            newtext = "Password Tidak Boleh Kosong!";
            MessageBox messageBox = new MessageBox();
            messageBox.messageinfo(newtext);
            messageBox.setVisible(true);

        } else {

            connectToDatabase();

            PreparedStatement syntax = conn.prepareStatement("SELECT * FROM akun WHERE username = ?");
            syntax.setString(1, username);
            ResultSet verivikasi_username = syntax.executeQuery();
            Boolean cek_username = verivikasi_username.next();

            if (cek_username) {

                newtext = "Username Telah Dipakai!";
                MessageBox messageBox = new MessageBox();
                messageBox.messageinfo(newtext);
                messageBox.setVisible(true);

            } else {

                PreparedStatement syntax1 = conn.prepareStatement("INSERT INTO akun (username, password) VALUES (?, ?)");
                syntax1.setString(1, username);
                syntax1.setString(2, password);
                syntax1.executeUpdate();

                RegisterForm.jLabel3.setVisible(true);
                RegisterForm.jLabel4.setVisible(true);
                RegisterForm.jLabel5.setVisible(true);

                Timer timer = new Timer();

                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        RegisterForm.jLabel3.setVisible(false);
                        RegisterForm.jLabel4.setVisible(false);
                        RegisterForm.jLabel5.setVisible(false);
                    }
                }, 3000);
            }
        }

        closeConnection();
    }
}
