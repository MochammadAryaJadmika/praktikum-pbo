/**
 Nama file	:Manajer.java
 Tanggal	:3 Mei 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Kelas yang menerapkan objek manajer dan merupakan subclass objek pegawai.
**/

public class Manajer extends Pegawai{
	private int tunjangan = 700000;
	
	public Manajer(String nama){
		setNama(nama);
	}
	
	public void tampilData(){
		super.tampilData();
		System.out.println("Tunjangan : " + tunjangan);
	}
}