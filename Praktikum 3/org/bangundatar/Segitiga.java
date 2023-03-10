/**
 Nama file	:Segitiga.java
 Tanggal	:8 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Representasi dasar dari objek segitiga, turunan kelas poligon
**/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas, tinggi;
	
	public Segitiga(double alas,double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return 0.5 * alas * tinggi;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
	}
}