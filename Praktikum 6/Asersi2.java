/**
 Nama file	:Asersi2.java
 Tanggal	:29 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Program untuk demo asersi, yang akan menolak input 
 jari-jari lingkaran yang bernilai nol
**/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari-jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "
			+kelilingLingkaran);
	}
}

/**Pertanyaan:
   Secara konsep, ada yang kurang tepat pada program Asersi2 diatas?
   Jawab:
   Secara konsep, terdapat kesalahan pada program Asersi2 di atas. 
   variabel jariJari diinisialisasi dengan nilai 0 
   dan kemudian dilakukan asersi (assert) pada baris ke-25 untuk 
   memastikan bahwa jariJari harus lebih besar dari 0. 
   Namun, nilai jariJari yang sudah diinisialisasi tetaplah 0 sehingga 
   asersi tersebut akan selalu gagal dan program akan berhenti secara 
   tidak terduga. Oleh karena itu, nilai awal jari-jari atau variabel jariJari seharusnya 
   diinisialisasi lebih besar dari nol agar asersi tersebut dapat berfungsi dengan benar.
**/
