package com.neverlands.siskesdig.programs;
import com.neverlands.siskesdig.programs.controller.config;

import java.util.Scanner;
import java.sql.*;

public class DatabasePenyakit {
    
    public static void main(String[] args) throws Exception {
        
        Connection conn = DriverManager.getConnection(config.MYSQL_url,config.MYSQL_username ,config.MYSQL_password);

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Pilih Tambah atau Hapus!\n"
                    + "Pilih Menu:\n"
                    + "1. Tambah\n"
                    + "2. Hapus");
            System.out.print("Pilihan: ");
            String pilihan = scanner.nextLine();
            
            if (pilihan.equals("1")) {

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.print("Masukkan Kode Penyakit: ");
                String inputKode = scanner.nextLine();

                System.out.print("Masukkan Nama Penyakit: ");
                String inputPenyakit = scanner.nextLine();
                
                System.out.print("Masukkan Deskripsi Penyakit: ");
                String inputDeskripsi = scanner.nextLine();
                
                System.out.print("Masukkan Gejala Penyakit: ");
                String inputGejala = scanner.nextLine();

                PreparedStatement syntax = conn.prepareStatement("INSERT INTO penyakit (kode_penyakit, nama_penyakit, deskripsi_penyakit, gejala_penyakit) VALUES (?, ?, ?, ?)");
                syntax.setString(1, inputKode);
                syntax.setString(2, inputPenyakit);
                syntax.setString(3, inputDeskripsi);
                syntax.setString(4, inputGejala);
                syntax.executeUpdate();

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("Data telah ditambahkan!");

            } else if (pilihan.equals("2")) {

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.print("Masukkan Nama Penyakit: ");
                String inputPenyakit = scanner.nextLine();
                
                PreparedStatement deleteSyntax = conn.prepareStatement("DELETE FROM penyakit WHERE nama_penyakit = ?");
                deleteSyntax.setString(1, inputPenyakit);
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
}