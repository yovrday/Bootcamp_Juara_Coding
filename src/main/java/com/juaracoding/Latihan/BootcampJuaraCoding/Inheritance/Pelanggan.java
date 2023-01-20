package com.juaracoding.Latihan.BootcampJuaraCoding.Inheritance;

public class Pelanggan {

	int noPelanggan ;
	String nama;
	Alamat alamat;
	
	public Pelanggan (int noPelanggan, String nama, Alamat alamat) {
		this.noPelanggan = noPelanggan;
		this.nama = nama;
		this.alamat = alamat;
	}

	void tampilPelanggan () {
		System.out.println("No Pelanggan : "+noPelanggan);
		System.out.println("Nama Pelanggan : "+nama);
		System.out.println("Alamat :");
		System.out.println("Jalan : "+alamat);
		System.out.println("Kota : "+alamat);
		System.out.println("Negara : "+alamat);
	}
	}
