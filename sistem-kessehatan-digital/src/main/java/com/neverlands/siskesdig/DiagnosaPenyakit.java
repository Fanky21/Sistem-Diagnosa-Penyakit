package com.neverlands.siskesdig;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagnosaPenyakit {

    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(Main.mysql_url, Main.username, Main.password);

        Scanner scan = new Scanner(System.in);

        System.out.println("Selamat datang didiagnosa penyakit, Mohon deskripsikan penyakit yang anda alami dibawah ini!");
        System.out.print("Keluhan/Gejala: ");
        String sentence = scan.nextLine();

        String gejala = "Radang,Bersin,Sesak,Nyeri sendi,Kelelahan,Demam,Penurunan berat badan,Sakit kepala,Muntah,lemas,Sesak napas,Berat badan menurun,Lemas,kaku,Kejang,Mudah lelah,Penglihatan kabur,Gangguan penglihatan,Mual,muntah,Sulit berkonsentrasi,Diare,Pusing,Pingsan,Nyeri,panas,Hilang nafsu makan,Linglung,Lemah otot,Penurunan kesadaran,Mata merah,Mata bengkak,Sakit tenggorokan,Jantung berdebar,Nyeri dada,Mual,Tubuh mudah lelah,Pembengkakan,Keringat dingin";
        String[] filterArray = gejala.split(",\\s*");
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

        String output_data = filteredWords.toString();

        System.out.println(output_data);

        StringBuilder queryBuilder = new StringBuilder("SELECT nama_penyakit FROM penyakit WHERE");
        List<String> placeholders = new ArrayList<>();

        String[] gejalaArray = output_data.split(",\\s*");
        for (int i = 0; i < gejalaArray.length; i++) {
            String placeholder = "gejala_penyakit LIKE ?";
            placeholders.add("%" + gejalaArray[i] + "%");

            if (i > 0) {
                queryBuilder.append(" AND");
            }
            queryBuilder.append(" ").append(placeholder);
        }

        String query = queryBuilder.toString();
        PreparedStatement syntax = conn.prepareStatement(query);
        for (int i = 0; i < placeholders.size(); i++) {
            syntax.setString(i + 1, placeholders.get(i));
        }

        ResultSet hasil = syntax.executeQuery();
        boolean status_hasil = hasil.next();

        System.out.println(status_hasil);

        if (status_hasil) {

            System.out.println("Proses!");

            List<String> penyakitList = new ArrayList<>();

            while (hasil.next()) {
                String data = hasil.getString("nama_penyakit");
                penyakitList.add(data);
            }

            int counter = penyakitList.size();

            if (counter > 3) {

                System.out.println("Mohon masukkan gejala yang lebih spesifik!");

            } else if (counter <= 3) {

                System.out.println("Penyakit kamu adalah: ");

                if (counter == 0) {

                    System.out.println("Tidak ada penyakit yang cocok dengan gejala yang diberikan.");

                } else {
                    
                    for (String penyakit : penyakitList) {
                        System.out.println(penyakit);
                    }
                }
            }

        } else {

            System.out.println("Data Penyakit Tidak Ditemukan!");

        }

    }
    
}
