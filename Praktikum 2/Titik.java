/**
 Nama file	:Titik.java
 Tanggal	:1 Maret 2023
 Penulis	:Mochammad Arya Jadmika
 Deskripsi	:Program kelas Titik
**/

class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	public Titik(double a, double b){
		absis = a;
		ordinat = b;
		counterTitik++;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	public void setOrdinat(double b){
		ordinat = b;
	}
	
	public double getAbsis(){
		return absis;
	}
	public double getOrdinat(){
		return ordinat;
	}
	
	public int getCounterTitik(){
		return counterTitik;
	}
}