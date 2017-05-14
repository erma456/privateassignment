package id.sch.smktelkom_mlg.privateassignment.xirpl611.tugasakhir;

import java.io.Serializable;

/**
 * Created by Erma on 13/05/2017.
 */

public class New implements Serializable {
    private String gambar;
    private String judul;
    private String deskripsi;
    private String buat;

    public New(String gambar, String judul, String deskripsi, String buat) {
        this.gambar = gambar;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.buat = buat;
    }

    public String getGambar() {
        return gambar;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getBuat() {
        return buat;
    }
}
