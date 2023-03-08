/**
 Nama file	:OperasiTitik.java
 Tanggal	:1 Maret 2023
 Penulis	:Mochammad Arya Jadmika
 Deskripsi	:Program kelas Operasi Titik
**/

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
		refleksiSumbuX(t1);
		return t1;
	}
	
	public Titik refleksiY(Titik t1) {
		refleksiSumbuY(t1);
		return t1;
	}
}
