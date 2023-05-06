/**
 Nama file	:Programmer.java
 Tanggal	:3 Mei 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Kelas yang menerapkan objek programmer dan merupakan subclass objek pegawai.
**/

public class Programmer extends Pegawai{
	private int bonus = 450000;
	
	public Programmer(String nama){
		setNama(nama);
	}
	
	public void tampilData(){
		super.tampilData();
		System.out.println("Bonus : " + bonus);
	}
}