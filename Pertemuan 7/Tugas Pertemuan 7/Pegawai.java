/*
 * Nama File    : Pegawai.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Superclass Pegawai
 * Tanggal      : 10 Mei 2023
 */


public class Pegawai {
    protected String nama; // di modul ditulis private namun apabila diturunkan maka tidak bisa
    protected int gajiPokok = 500000;
    public Pegawai(String nama){
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok);
    }
}