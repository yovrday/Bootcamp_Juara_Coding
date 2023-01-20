package com.juaracoding.Latihan.BootcampJuaraCoding.Super;

public class Ayah {
	public static String nama ;
	
	public String alamat;
	
	public Ayah (String nama, String alamat) {
		this.nama= nama;
		this.alamat=alamat;	
	}
	
	static void cetak1 () {
		
		System.out.println("Halo");
		System.out.println(nama);//static dari 
	}
	void cetak () {
		
		System.out.println("Halo");
		System.out.println(this.nama);
		System.out.println(this.alamat);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ayah budi = new Ayah("Budi","Jakarta");
		budi.cetak();
		Ayah.cetak1();//static dari method
	}
}
