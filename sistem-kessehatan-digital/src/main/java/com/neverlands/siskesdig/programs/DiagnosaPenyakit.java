package com.neverlands.siskesdig.programs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiagnosaPenyakit extends Mysql {
    private String username;

    public DiagnosaPenyakit(String mysqlUrl, String mysqlUsername, String mysqlPassword) {
        super(mysqlUrl, mysqlUsername, mysqlPassword);
        this.username = username;
    }

    public List<String> StartDiagnosa(String sentence) throws SQLException {

        StringBuilder filteredWords = new StringBuilder();
        String gejala = "Radang,Bersin,Sesak,Nyeri sendi,Kelelahan,Demam,Penurunan berat badan,Sakit kepala,Muntah,lemas,Sesak napas,Berat badan menurun,Lemas,kaku,Kejang,Mudah lelah,Penglihatan kabur,Gangguan penglihatan,Mual,muntah,Sulit berkonsentrasi,Diare,Pusing,Pingsan,Nyeri,panas,Hilang nafsu makan,Linglung,Lemah otot,Penurunan kesadaran,Mata merah,Mata bengkak,Sakit tenggorokan,Jantung berdebar,Nyeri dada,Mual,Tubuh mudah lelah,Pembengkakan,Keringat dingin";
        String[] filterArray = gejala.split(",\\s*");

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

        List<String> penyakitList = new ArrayList<>();

        // if (status_hasil) {

        //     while (hasil.next()) {
        //         String data = hasil.getString("nama_penyakit");
        //         penyakitList.add(data);
        //     }

        //     int counter = penyakitList.size();

        //     if (counter > 3) {

        //         HasilDiagnosaForm.Hasil2.setText("Mohon masukkan gejala yang lebih spesifik!");

        //     } else if (counter <= 3) {

        //         if (counter == 0) {
        //             HasilDiagnosaForm.Hasil2.setText("Tidak ada penyakit yang sesuai");

        //         } else {

        //             System.out.println("Penyakit kamu adalah: ");
        //             for (String penyakit : penyakitList) {
        //                 System.out.println(penyakit);
        //             }

        //             int persentage = 100 / counter;
        //             System.out.println("Persentase terkena penyakit di atas adalah: " + persentage + "%");

        //             LocalDate currentDate = LocalDate.now();

        //             PreparedStatement riwayat_penyakit = conn.prepareStatement("INSERT INTO riwayat_penyakit (username, tanggal_diagnosa, penyakit) VALUES (?,?,?)");
        //             riwayat_penyakit.setString(1, username);
        //             riwayat_penyakit.setString(2, currentDate.toString());

        //             for (String penyakit : penyakitList) {
        //                 riwayat_penyakit.setString(3, penyakit);
        //                 riwayat_penyakit.executeUpdate();
        //             }

        //         }
        //     }
        // } else {

        //     System.out.println("Data Penyakit Tidak Ditemukan!");

        //     HasilDiagnosaForm.Hasil2.setText("Data Penyakit Tidak Ditemukan!");

        // }

        return penyakitList;

        }
    }
