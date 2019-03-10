package com.test.asus.gdwiki.modeler;

public class model {
    String nama;
    int gambar;
    String overview;

    public model(String nama, int gambar, String overview) {
        this.nama = nama;
        this.gambar = gambar;
        this.overview = overview;
    }

    public int getGambar() {
        return gambar;
    }

    public String getName() { // get data name dalam bentuk stirng
        return nama;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) { this.overview = overview; }

}
