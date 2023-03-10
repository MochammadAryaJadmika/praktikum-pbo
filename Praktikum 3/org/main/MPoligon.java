/**
 Nama file	:MPoligon.java
 Tanggal	:8 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:driver class untuk poligon dan persegi panjang
**/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		Segitiga segitiga = new Segitiga(2,12,3);
		persegi.printInfo();
		segitiga.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}