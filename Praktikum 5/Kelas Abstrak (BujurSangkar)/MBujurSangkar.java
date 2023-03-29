/**
 Nama file	:MBujurSangkar.java
 Tanggal	:25 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:kelas yang mengimplementasi cara menghitung luas bujur sangkar
**/

import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
	}
}