/**
 Nama file	:AngkaSial.java
 Tanggal	:29 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
**/
public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			// method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/**Pertanyaan:
	1) Ketika eksepsi terjadi, apakah baris 12 pada AngkaSiall.java diatas dieksekusi?
	2) Apakah baris 21 pada AngkaSial.java diatas dieksekusi?
	
	Jawab:
	1) Tidak, Ketika eksepsi terjadi, baris 12 pada AngkaSial.java di atas tidak akan dieksekusi. 
	   Karena pada baris 8 program menggunakan klausa 'throw' untuk mengeluarkan instance 
	   'AngkaSialException', sehingga program akan langsung melompat ke blok 'catch' tanpa 
	   mengeksekusi baris selanjutnya pada 'try'. 
	2) Ya, Baris 21 pada AngkaSial.java akan dieksekusi karena kode tersebut berada 
	   di luar blok try-catch sehingga akan tetap dijalankan, baik terjadi eksepsi atau tidak.
**/