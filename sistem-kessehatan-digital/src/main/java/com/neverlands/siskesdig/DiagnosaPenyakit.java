package com.neverlands.siskesdig;
import java.sql.*;
import java.util.Scanner;

public class DiagnosaPenyakit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Selamat datang didiagnosa penyakit, Mohon deskripsikan penyakit yang anda alami dibawah ini!");
        System.out.print("Keluhan/Gejala: ");
        String sentence = scan.nextLine();

        String filterWords = "sakit, makan, diare";
        String[] filterArray = filterWords.split(",\\s*");
        StringBuilder filteredWords = new StringBuilder();

        for (String word : filterArray) {
            String pattern = "(?i)\\b" + word.trim() + "\\b";
            if (sentence.matches(".*" + pattern + ".*")) {
                if (filteredWords.length() > 0) {
                    filteredWords.append(", ");
                }
                filteredWords.append(word.trim());
            }
        }

        System.out.println(filteredWords.toString());

    }
    
}
