/**
 Nama file	:ExceptionOnArray.java
 Tanggal	:29 Maret 2023
 Penulis	:Mochammad Arya Jadmika / 24060121130085
 Deskripsi	:Program penggunaan eksepsi menggunakan class library java
**/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}