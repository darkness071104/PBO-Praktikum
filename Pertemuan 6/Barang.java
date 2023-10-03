/*
 * Nama File    : Barang.java
 * Nama Pembuat : Fauzan Ramadhan Putra
 * NIM          : 24060121140140
 * Deskripsi    : Program class barang
 * Tanggal      : 11 April 2023
 */

public class Barang {
    private String id;
	private String nama;
	private int stok;

    public Barang(String id, String nama, int stok) {
        this.id = id;
		this.nama = nama;
		this.stok = stok;
    }

	public String getId() {
		return this.id;
	}
	
	public String getNama() {
		return this.nama;
	}

    public int getStok() {
		return this.stok;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}

    public void kurangiStok(int jumlah) {
        this.setStok(this.getStok() - jumlah);
    }
}