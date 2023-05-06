/**
 Nama file	:Vehicle.java
 Tanggal	:3 Mei 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Kelas yang menerapkan superclass objek vehicle.
**/

public class Vehicle {
	void calRent(int distance, float price){
		float fare=distance*price;
		System.out.println("vehicle price = "+fare);
	}
}