package com.juaracoding.Latihan.BootcampJuaraCoding.Inheritance;

public class Kalkulator {
 int bilangan1;
 int bilangan2;
 Operasi operasi;
 
 Kalkulator (int bilangan1, int bilangan2, Operasi operasi){
	 this.bilangan1=bilangan1;
	 this.bilangan2 = bilangan2;
	 this.operasi = operasi;
 }
 void cetak (String jenisoperasi) {
	 switch  (jenisoperasi) {
	 case "tambah":
	 	System.out.println("Tambah :"+this.operasi.tambah(bilangan1,bilangan2));
	 	break;
	 case "kurang":
	 	System.out.println("Kurang :"+this.operasi.kurang(bilangan1,bilangan2));
	 	break;
	 case "kali":
		 	System.out.println("Kali :"+this.operasi.kali(bilangan1,bilangan2));
		 	break;
	 case "bagi":
		 	System.out.println("Bagi :"+this.operasi.bagi(bilangan1,bilangan2));
		 	break;
	default:
	 	//System.out.println("Tambah :"+this.operasi.tambah(bilangan1,bilangan2));
	 	break;
	 }
 }
}
