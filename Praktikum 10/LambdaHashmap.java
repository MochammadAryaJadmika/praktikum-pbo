/**
 Nama file	:LambdaHashmap.java
 Tanggal	:31 Mei 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Implementasi lambda pada hashmap
**/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap{
	public static void main(String[] args){
		Map<String, String> mahasiswaMap = new HashMap<>();
		mahasiswaMap.put("24060121130085", "Mochammad Arya Jadmika");
		
		mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama));
	}
}