package com.juaracoding.Latihan.BootcampJuaraCoding.Inheritance;

import java.util.Scanner;

public class Contoh_Inheritance {

	public static void main(String[] args) {
		// single inheritence
// Kucing oyeng = new Kucing ();
// oyeng.makan();;// sudah di extend dari Animal
// oyeng.suara();// sudah di class Kucing
// //multi inheritance
// Kitten koyen = new Kitten();
// koyen.makan();
// koyen.suara();
// koyen.minumASI();
// //hirarki 
// Kambing jon = new Kambing();
// jon.makan();
// jon.suara();
// 
//alamat
//	Alamat alamatbudi = new Alamat ("Jl.Baru no.44","Jakarta","Indonesia");
//	Pelanggan budi = new Pelanggan(123,"Budi Ardian",alamatbudi);
//	budi.tampilPelanggan();
	
	//hitungkalkulator
	Scanner scan = new Scanner(System.in);
	System.out.println("Masukan Angka Pertama : ");
	int a  = scan.nextInt();
	System.out.println("Masukan Angka Kedua : ");
	int b  = scan.nextInt();
	Kalkulator kalkulator = new Kalkulator(a, b, new Operasi());
	kalkulator.cetak("tambah");
	kalkulator.cetak("kurang");
	kalkulator.cetak("kali");
	kalkulator.cetak("bagi");
	
}
}
