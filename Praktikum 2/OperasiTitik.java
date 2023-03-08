/**
 Nama file	:OperasiTitik.java
 Tanggal	:1 Maret 2023
 Penulis	:Mochammad Arya Jadmika
 Deskripsi	:Program kelas Operasi Titik
**/

/********LATIHAN***********/
class OperasiTitik1 {
	public void refleksiSumbuX(Titik titik) {
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	
	public void refleksiSumbuY(Titik titik) {
		double absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
	}
}

/********TUGAS***********/

class OperasiTitik {
	private void refleksiSumbuX(Titik t1) {
		double ordinat = t1.getOrdinat();
		ordinat = ordinat * -1;
		t1.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik t1) {
		double absis = t1.getAbsis();
		absis = absis * -1;
		t1.setAbsis(absis);
	}
	
	public void refleksiX(Titik t1) {
		refleksiSumbuX(t1);
	}
	
	public void refleksiY(Titik t1) {
		refleksiSumbuY(t1);
	}
}
