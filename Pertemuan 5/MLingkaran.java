/*
 * Nama File    : BangunDatar.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : File implementasi cara mengihtung luas lingkaran
 * Tanggal      : 25 Maret 2023
 */

import java.util.Scanner;

public class MLingkaran {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jejari lingkaran : ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
	}
}