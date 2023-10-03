// Titik.java  01/03/2023
// Nama : Fauzan Ramadhan Putra (24060121140140)
// Deskripsi : kelas untuk titik

class Titik{
	//atribut
	private double absis;
	private double ordinat;
	private static int counterTitik;
	//metode
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	public Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	public double getAbsis(){
		return absis;
	}
	public double getOrdinat(){
		return ordinat;
	}
	public double setOrdinat(){
		return ordinat;
	}
	public void setAbsis(double a){
		absis = a;
	}
	public void setOrdinat(double o){
		ordinat = o;
	}
	public int getCounterTitik(){
		return counterTitik;	
	}
}
