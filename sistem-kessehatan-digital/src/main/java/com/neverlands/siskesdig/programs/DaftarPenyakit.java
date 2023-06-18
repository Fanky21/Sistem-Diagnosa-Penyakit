package com.neverlands.siskesdig.programs;

import java.sql.SQLException;

public class DaftarPenyakit extends DataBasePenyakit {
    
    public DaftarPenyakit(String inputKode, String inputPenyakit, String inputDeskripsi, String inputGejala) throws SQLException {
        super(inputKode, inputPenyakit, inputDeskripsi, inputGejala);
    }
    
    public void showInfo(){
        //Menampilkan gejala dan deskripsi
    }
    
}
