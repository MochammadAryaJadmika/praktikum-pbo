/**
 Nama file	:BujurSangkar.java
 Tanggal	:25 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:kelas yang membuat implementasi metode abstrak pada bangun datar
**/

public class BujurSangkar extends BangunDatar{
	public double hitungLuas(double sisi){
		luas = sisi*sisi;
		return luas;
	}
}

/**Pertanyaan:
	Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi
	metode abstrak yang ada pada kelas BangunDatar? jelaskan!
	
   Jawab:
   Jika kelas BujurSangkar tidak memberikan implementasi untuk metode abstrak 
   dari kelas BangunDatar, maka akan menyebabkan kesalahan kompilasi saat mencoba 
   membuat objek dari kelas BujurSangkar atau dari turunan kelas BujurSangkar yang 
   tidak memberikan implementasi untuk metode abstrak tersebut. Oleh karena itu, 
   penting bagi kelas turunan untuk memberikan implementasi untuk semua metode 
   abstrak yang didefinisikan oleh kelas induk agar dapat digunakan secara benar.
   