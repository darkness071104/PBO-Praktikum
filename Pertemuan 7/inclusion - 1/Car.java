/*
 * Nama File    : Car.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Subclass Car dari Superclass Vehicle
 * Tanggal      : 10 Mei 2023
 */

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare = fare-100.00f;
        System.out.println("Harga sewa mobil = "+fare);
    }
}