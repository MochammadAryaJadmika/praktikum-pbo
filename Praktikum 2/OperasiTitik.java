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
	public Titik refleksiX(Titik t1) {
		Titik T2 = new Titik(t1.getAbsis(), t1.getOrdinat()); 
		refleksiSumbuX(T2);
		return T2;
	}
	
	public Titik refleksiY(Titik t1) {
		Titik T2 = new Titik(t1.getAbsis(), t1.getOrdinat());
		refleksiSumbuY(T2);
		return T2;
	}
}
