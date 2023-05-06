/**
 Nama file	:PegawaiDanGaji.java
 Tanggal	:3 Mei 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Kelas main untuk pegawai, programmer, dan juga manajer.
**/

public class PegawaiDanGaji{
	public static void main(String args[]){
		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}