// MOpearasiTitik.java  01/03/2023
// Nama : Fauzan Ramadhan Putra (24060121140140)
// Deskripsi : main untuk kelas OperasiTitik

class MOperasiTitik{
	public static void main(String[] args){
		Titik t1;
		OperasiTitik OT;
		
		t1 = new Titik(4,4);
		OT = new OperasiTitik();
		
		System.out.println("titik ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		
		OT.refleksiX(t1);
	
		System.out.println("titik setelah refelksi sb X: ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		
		OT.refleksiY(t1);
		
		System.out.println("titik setelah refelksi sb y: ("+t1.getAbsis()+", "+t1.getOrdinat()+")");
	}
}