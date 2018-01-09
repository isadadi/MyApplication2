package com.example.isadadi.myapplication.Model;

/**
 * Created by isadadi on 29/11/2017.
 */

public class Mahasiswa {

    private String nim, nama, foto;

    public Mahasiswa(String nim, String nama, String foto) {
        this.nim = nim;
        this.nama = nama;
        this.foto = foto;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
