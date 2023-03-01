/**
 Nama file	:Titik.java
 Tanggal	:22 Febbruari 2023
 Penulis	:Mochammad Arya Jadmika
 Deskripsi	:Program kelas Titik
**/

class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double a, double b){
		absis = a;
		ordinat = b;
		counterTitik++;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	void setOrdinat(double b){
		ordinat = b;
	}
	
	double getAbsis(){
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}