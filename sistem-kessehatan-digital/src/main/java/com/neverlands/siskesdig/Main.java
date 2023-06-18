package com.neverlands.siskesdig;
import java.util.Scanner;
import java.sql.*;

public class Main {

    static final String mysql_url = "jdbc:mysql://51.161.134.32/sistem_kesehatan";
    static final String username = "database_pbo";
    static final String password = "pbo331";

    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(mysql_url, username, password);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("Selamat Datang diprogram sistem kesehatan digital!\n"
                + "Silahkan Pilih Menu dibawah ini:\n"
                + "1. Login\n"
                + "2. Register");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilihan: ");
        
        String pilihan = scanner.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        if (pilihan.equals("1")) {

            System.out.println("Selamat datang diprogram Sistem kesehatan digital terpadu! \n"
            + "Silahkan login menggunakan akun yang ada!");

            System.out.print("Username: ");

            String inputUsername = scanner.nextLine();

            System.out.println("Silahkan masukkan password yang ada!");
            System.out.print("Password: ");

            String inputPassword = scanner.nextLine();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Anda memasukkan data sebagai berikut \n" 
            + "Username anda: " + inputUsername + "\n"
            + "Password anda: " + inputPassword + "\n"
            + "Silahkan konfirmasi dengan tekan 1 dan tekan 2 untuk cancel!");

            System.out.print("Pilihan: ");

            String confirmation = scanner.nextLine();

            if (confirmation.equals("1")) {

                PreparedStatement syntax = conn.prepareStatement("SELECT * FROM akun WHERE username = ? AND password = ?");
                syntax.setString(1, inputUsername);
                syntax.setString(2, inputPassword);
                ResultSet hasil = syntax.executeQuery();
                Boolean status_login = hasil.next();

                if (status_login) {

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Selamat datang " + inputUsername);

                    MainMenu.main(args);

                } else {

                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    
                    System.out.println("Login gagal, Silahkan cek username dan password kembali!");

                    return;

                }

            } else if (confirmation.equals("2")) {

                System.out.print("\033[H\033[2J");
                System.out.flush();
                
                System.out.println("Cancel");

                return;

            }
            
        } else if (pilihan.equals("2")) {

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Selamat datang di sistem kesehatan digital, silahkan membuat akun!");

            System.out.print("Masukkan username: ");
            String username_register = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password_register = scanner.nextLine();

            System.out.println("Silahkan konfirmasi kembali \n"
            + "Username anda: " + username_register + "\n"
            + "Password anda: " + password_register + "\n"
            + "Silahkan konfirmasi dengan tekan 1 dan tekan 2 untuk cancel!");

            String konfirmasi = scanner.nextLine();

            if (konfirmasi.equals("1")) {

                PreparedStatement syntax = conn.prepareStatement("INSERT INTO akun (username, password) VALUES (?, ?)");
                syntax.setString(1, username_register);
                syntax.setString(2, password_register);
                syntax.executeUpdate();

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("Akun berhasil dibuat, silahkan login!");

            } else if (konfirmasi.equals("2")) {

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("Cancel");

                return;

            }

        }

    }
}
