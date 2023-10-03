// MOpearasiTitik.java  22/02/2023
// Nama : Fauzan Ramadhan Putra (24060121140140)
// Deskripsi : main untuk kelas titik

class MTitik{
	public static void main(String[] args){
		Titik t1,t2, t3;
		t1 = new Titik();t1.setAbsis(2);t1.setOrdinat(4);
		t2 = new Titik();t2.setAbsis(1);t2.setOrdinat(5);
		t3 = new Titik(5,6);
		
		System.out.println("jumlah objek titik : "+t1.getCounterTitik());
		System.out.println("t1("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		System.out.println("t2("+t2.getAbsis()+", "+t2.getOrdinat()+")");
		System.out.println("t3( "+t3.getAbsis()+", "+t3.getOrdinat()+")");
	}
}