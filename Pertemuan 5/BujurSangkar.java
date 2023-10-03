/*
 * Nama File    : BujurSangkar.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : File class implementasi method dari abstract class bangun datar
 * Tanggal      : 25 Maret 2023
 */

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
    // jika implementeasi metode dari abstrak tidak dibuat maka akan terjadi error
    // dimana file bujursangkar tidak dapat dikompile dan tidak dianggap sebagai inherit abstract dari bangun datar
}