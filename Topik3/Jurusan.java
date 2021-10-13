package Topik3;

import java.util.ArrayList;

public class Jurusan {
    private String kode, nama;
    private ArrayList<Mahasiswa> mhs;

    public Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
        this.mhs = new ArrayList<>();
    }

    void addMhs(Mahasiswa m){
        mhs.add(m);
    }

    String getKode(){
        return kode;
    }

    String getNama(){
        return nama;
    }

    ArrayList<Mahasiswa> getMhs(){
        return mhs;
    }

}
