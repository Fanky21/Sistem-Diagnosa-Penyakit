package com.neverlands.siskesdig;
import java.util.Scanner;

public class DatabasePenyakit {

    static final String mysql_url = "jdbc:mysql://51.161.134.32/sistem_kesehatan";
    static final String username = "database_pbo";
    static final String password = "pbo331";
    
    public static void main(String[] args) {

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
        
        if (pilihan.equals(1)) {
           
            System.out.println("Data telah ditambahkan!");

        } else if (pilihan.equals(2)) {

            System.out.println("Data telah dihapus!");

        } else {

            System.out.println("Pilihan tidak valid!");
        }
    }
}