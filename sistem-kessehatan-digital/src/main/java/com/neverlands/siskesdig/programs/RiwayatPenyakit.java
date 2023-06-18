
package com.neverlands.siskesdig.programs;

import java.sql.SQLException;

public class RiwayatPenyakit extends DatabasePenyakit {
    
    public RiwayatPenyakit(String inputKode, String inputPenyakit, String inputDeskripsi, String inputGejala) throws SQLException {
        super(inputKode, inputPenyakit, inputDeskripsi, inputGejala);
    }
    
    public void showInfo(){
        //Menampilkan penyakit yang pernah di search
    }
    
}
