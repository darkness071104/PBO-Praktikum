// MOpearasiTitik.java  22/02/2023
// Nama : Fauzan Ramadhan Putra (24060121140140)
// Deskripsi : Kelas untuk titik

class Titik{
	//atribut
	double absis;
	double ordinat;
	static int counterTitik;
	//metode
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	double getAbsis(){
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	double setOrdinat(){
		return ordinat;
	}
	void setAbsis(double a){
		absis = a;
	}
	void setOrdinat(double o){
		ordinat = o;
	}
	int getCounterTitik(){
		return counterTitik;	
	}
}
