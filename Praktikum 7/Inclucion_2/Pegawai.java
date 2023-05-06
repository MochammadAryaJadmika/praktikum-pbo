/**
 Nama file	:Pegawai.java
 Tanggal	:3 Mei 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Kelas yang menerapkan superclass objek pegawai.
**/

public class Pegawai {
	private String nama;
	private int gajiPokok = 5000000;
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void tampilData(){
		System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
	}
}