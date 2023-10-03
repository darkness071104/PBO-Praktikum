/*
 * Nama File    : Progammer.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Subclass dari pegawai yakni Progammer
 * Tanggal      : 10 Mei 2023
 */


public class Progammer extends Pegawai {
    protected int bonus = 450000;
    public Progammer(String nama) {
        super(nama);
    }
    public void tampilData() {
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Bonus: " + this.bonus);
    }
}