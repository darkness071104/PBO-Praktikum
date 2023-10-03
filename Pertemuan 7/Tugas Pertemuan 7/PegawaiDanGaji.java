/*
 * Nama File    : PegawaiDanGaji.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Program atau main class pegawai dan gaji
 * Tanggal      : 10 Mei 2023
 */

public class PegawaiDanGaji {
    public static void main(String [] args){
        Pegawai pegawai = new Progammer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");
        
        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}