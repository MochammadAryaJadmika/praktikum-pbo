/**
 Nama file	:BangunDatarGenericTest.java
 Tanggal	:17 Mei 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Main class untuk generic bangun datar.
**/

public class BangunDatarGenericTest {
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
		System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
		System.out.println("tipe generic : " +bdg.get().getClass().getName());
	}
}