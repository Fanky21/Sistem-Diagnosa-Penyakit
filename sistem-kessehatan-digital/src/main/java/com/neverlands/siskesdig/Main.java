package com.neverlands.siskesdig;
import java.util.Scanner;
import java.sql.*;

public class Main {

    static final String mysql_url = "jdbc:mysql://51.161.134.32/sistem_kesehatan";
    static final String username = "database_pbo";
    static final String password = "pbo331";

    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(mysql_url, username, password);
        
        System.out.println("Selamat Datang!\n"
                + "Pilih Menu:\n"
                + "1. Login\n"
                + "2. Register");
        
        Scanner scanner = new Scanner(System.in);
        
        String pilihan = scanner.nextLine();
        
        if (pilihan.equals("1")) {

            System.out.println("Selamat datang diprogram Sistem kesehatan digital terpadu! \n"
            + "Silahkan login menggunakan akun yang ada!");

            String inputUsername = scanner.nextLine();

            System.out.println("Silahkan masukkan password yang ada!");

            String inputPassword = scanner.nextLine();

            System.out.println("Anda memasukkan data sebagai berikut \n" 
            + "Username anda: " + inputUsername + "\n"
            + "Password anda: " + inputPassword + "\n"
            + "Silahkan konfirmasi dengan tekan 1 dan tekan 2 untuk cancel!");

            String confirmation = scanner.nextLine();

            if (confirmation.equals("1")) {

                PreparedStatement syntax = conn.prepareStatement("SELECT * FROM akun WHERE username = ? AND password = ?");
                syntax.setString(1, inputUsername);
                syntax.setString(2, inputPassword);

                ResultSet hasil = syntax.executeQuery();

                Boolean status_login = hasil.next();

                if (status_login) {

                    System.out.println("Selamat datang " + inputUsername);

                    System.out.println("Login berhasil");

                } else {
                    
                    System.out.println("Login gagal");
                }

            } else if (confirmation.equals("2")) {

                System.out.println("Cancel");

            }
            
        } else if (pilihan.equals("2")) {

        }

    }
}
