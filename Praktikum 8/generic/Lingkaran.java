/**
 Nama file	:Lingkaran.java
 Tanggal	:17 Mei 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Implementasi Lingkaran sebagai BangunDatar.
**/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}