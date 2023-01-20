package com.juaracoding.Latihan.BootcampJuaraCoding.Campuran;

public class Mobil {
	String bahanbakar;
	int tahunpembuatan = 2000;
	//construktor 
	//Mobil2 () {
	//System.out.println("Constructor Dipanggil");
	//}
	 Mobil (String bahanbakar, int tahunpembuatan){
		 this.bahanbakar = bahanbakar;
		this.tahunpembuatan = tahunpembuatan;	 
	 }
	 Mobil (String bahanbakar){
		 this.bahanbakar = bahanbakar;	
		 this.tahunpembuatan =2000;
	 }
	 Mobil (int tahunpembuatan){
		 this.bahanbakar ="Pertamax";
		this.tahunpembuatan = tahunpembuatan;	 
	 }
	 Mobil (){
		 this.bahanbakar ="Pertamax";
		 this.tahunpembuatan =2000;
	 }
	 
	 void warna() {
		 System.out.println("Warna Merah");
	 }
	 void mesin() {
		 System.out.println("Mesin 1800 cc");
	 }
	 int gettahunpembuatan() {
		 return tahunpembuatan;
	 }
	 String getbahanbakar( ) {
		 return bahanbakar;
	 }
}
