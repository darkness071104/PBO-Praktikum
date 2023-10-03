import static java.lang.Math.PI;

/*
 * Nama File    : Lingkaran.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : File kelas implementasi IArea berupa cara menghitung luas lingkaran
 * Tanggal      : 25 Maret 2023
 */

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}