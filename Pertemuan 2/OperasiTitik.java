// OpearasiTitik.java  01/03/2023
// Nama : Fauzan Ramadhan Putra (24060121140140)
// Deskripsi : kelas untuk Operasi Titik

 class OperasiTitik{
	 private void refleksiSumbuX(Titik titik){
		titik.setOrdinat((titik.getOrdinat())*-1);
	 }
	 
	 private void refleksiSumbuY(Titik titik){
		titik.setAbsis((titik.getAbsis())*-1);
	 }
	 
	 public void refleksiX(Titik t){
		refleksiSumbuX(t);
	 }
	 
	 public void refleksiY(Titik t){
		refleksiSumbuY(t);
	 }
	 
 }