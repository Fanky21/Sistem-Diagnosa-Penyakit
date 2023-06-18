package com.neverlands.siskesdig;
import static com.neverlands.siskesdig.Main.mysql_url;
import static com.neverlands.siskesdig.Main.password;
import static com.neverlands.siskesdig.Main.username;
import java.util.Scanner;
import java.sql.*;

public class DatabasePenyakit {
    
    public static void main(String[] args) throws Exception {
        
        Connection conn = DriverManager.getConnection(mysql_url, username, password);

        Scanner scanner = new Scanner(System.in);

        String pilihan = scanner.nextLine();

        System.out.println("Masukkan Nama Penyakit!");

        String inputPenyakit = scanner.nextLine();

        System.out.println("Masukkan Gejala Penyakit!");

        String inputGejala = scanner.nextLine();

        System.out.println("Masukkan Deskripsi Penyakit!");

        String inputDeskripsi = scanner.nextLine();

        System.out.println("Pilih Tambah atau Hapus!\n"
                + "Pilih Menu:\n"
                + "1. Tambah\n"
                + "2. Hapus");
        
        if (pilihan.equals("1")) {
            PreparedStatement syntax = conn.prepareStatement("INSERT INTO akun (nama_penyakit, deskripsi_penyakit, gejala_penyakit) VALUES (?, ?, ?)");
            syntax.setString(1, inputPenyakit);
            syntax.setString(2, inputDeskripsi);
            syntax.setString(3, inputGejala);
            syntax.executeUpdate();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Data telah ditambahkan!");

        } else if (pilihan.equals("2")) {
            PreparedStatement deleteSyntax = conn.prepareStatement("DELETE FROM akun WHERE nama_penyakit = ? AND deskripsi_penyakit = ? AND gejala_penyakit = ?");
            deleteSyntax.setString(1, inputPenyakit);
            deleteSyntax.setString(2, inputDeskripsi);
            deleteSyntax.setString(3, inputGejala);
            deleteSyntax.executeUpdate();
            
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.println("Data telah dihapus!");

        } else {

            System.out.println("Pilihan tidak valid!");
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}