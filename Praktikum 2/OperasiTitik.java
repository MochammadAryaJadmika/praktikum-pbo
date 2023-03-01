/**
 Nama file	:OperasiTitik.java
 Tanggal	:1 Maret 2023
 Penulis	:Mochammad Arya Jadmika
 Deskripsi	:Program kelas Operasi Titik
**/

class OperasiTitik {
	private void refleksiSumbuX(Titik titik) {
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik) {
		double absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
	}
	
	public void refleksiX(Titik titik) {
		refleksiSumbuX(titik);
	}
	
	public void refleksiY(Titik titik) {
		refleksiSumbuY(titik);
	}
}