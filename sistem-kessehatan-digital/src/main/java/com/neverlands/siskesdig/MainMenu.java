package com.neverlands.siskesdig;

import java.util.Scanner;

public class MainMenu {
    
    public static void main(String[] args) {
        System.out.println("Selamat Datang" + Main.username + 
        "\nPilih Menu dibawah ini\n"+
        "1. Diagnosa Penyakit\n"+
        "2. Daftar Penyakit\n"+
        "3. Hubungi Dokter\n"+
        "4. Database Penyakit\n"+
        "5. Riwayat Penyakit");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilihan: ");

        String pilihan = scanner.nextLine();

<<<<<<< HEAD
        if(pilihan.equals(1)){
            DiagnosaPenyakit.main(args);
=======
        if(pilihan.equals("1")){
            System.out.println("Silahkan masukan gejala anda dengan jelas!");
            String inputGejala = scanner.nextLine();
>>>>>>> 89b851029f854fc8f2d291b31de57ee93210ed0d
        }

        else if(pilihan.equals("2")){
            System.out.println("Penyakit - penyakit yang terdaftar");
        }

        else if(pilihan.equals("3")){
            System.out.println("Hubungi kami di:\n"+
            "support@alodokter.com\n"+
            "WA: 081288880256\n"+
            "02130000256");
        }

        else if(pilihan.equals("4")){
            System.out.println("Database Penyakit:");
        }

        else if(pilihan.equals("5")){
            System.out.println("Riwayat:");
        }

        else{
            System.out.println("Pilihan tidak valid!");
        }
    }
}
