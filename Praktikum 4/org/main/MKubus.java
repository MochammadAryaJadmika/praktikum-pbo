/**
 Nama file	:MKubus.java
 Tanggal	:15 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:driver class untuk kubus
**/

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar BJ = new BujurSangkar(4);
		Kubus K = new Kubus(BJ);
		
		System.out.println("Volume Kubus = "+K.hitungVolume());
		System.out.println("Luas Alas Kubus = "+K.hitungLuasAlas());
	}
}