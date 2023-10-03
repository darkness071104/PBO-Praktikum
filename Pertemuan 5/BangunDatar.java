/*
 * Nama File    : BangunDatar.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : File abstract class bangun datar
 * Tanggal      : 25 Maret 2023
 */

public abstract class BangunDatar {
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l) {
		luas = l;
	}
	
	public double getLuas() {
		return luas;
	}
}