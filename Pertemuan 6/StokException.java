/*
 * Nama File    : StokException.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : exception untuk menolak pembelian barang jika stok tidak mencukupi
 * Tanggal      : 11 April 2023
 */

public class StokException extends Exception {
    public StokException(Barang barang) {
        super("Stok barang " + barang.getNama() + " (" + barang.getId() + ") tidak cukup!" );
    }
}