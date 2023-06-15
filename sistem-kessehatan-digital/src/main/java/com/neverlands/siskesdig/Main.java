/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neverlands.siskesdig;
import java.util.Scanner;

/**
 *
 * @author Fakhrizal
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Selamat Datang!\n"
                + "Pilih Menu:\n"
                + "1. Login\n"
                + "2. Register");
        
        Scanner scanner = new Scanner(System.in);
        
        String pilihan = scanner.nextLine();
        System.out.println("Pilihan anda: " + pilihan);
    }
}
