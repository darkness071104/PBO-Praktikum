/*
 * Nama File    : Vehicle.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Superclass Vehicle
 * Tanggal      : 10 Mei 2023
 */


public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle price = "+fare);
    }
}