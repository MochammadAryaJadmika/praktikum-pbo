/**
 Nama file	:MLingkaran.java
 Tanggal	:25 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Implementasi cara menghitung luas lingkaran
**/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jari-jari lingkaran : ");
		double jejari = scan.nextDouble();
		Lingkaran lingkaran = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jari-jari " + jejari +"satuan adalah "+lingkaran.hitungLuas());
	}
} 