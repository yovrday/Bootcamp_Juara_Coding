package com.juaracoding.Latihan.BootcampJuaraCoding.Campuran;

public class ContohMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 40;
		int a = 30;
		int b = 20;
		
		int hasil = Math.max(x, y);
		//terbesar
		System.out.println(Math.max(x,y));
		System.out.println(hasil);
		//terkecil
		System.out.println(Math.min(x,y));
		//perbandingan besar kecil
		hasil = Math.min(Math.max(a, b), Math.max(x,y));
		System.out.println(hasil);
		//akar
		double c = 64;
		double hasilDouble = Math.sqrt(c);
		System.out.println(hasilDouble);
		System.out.println(hasilDouble*hasilDouble);
		//angka negatif ke positif
		int h = -89;
		System.out.println(Math.abs(h));
		//no random
		System.out.println(Math.random());
		// no random 0 - 100
		int hasilRandom = (int)(Math.random()*101);
		System.out.println(hasilRandom);
		//pangkat
		double nilai1 = 5;
		double nilai2 = 2;
		double hasilpangkat = Math.pow(nilai1, nilai2);
		System.out.println(hasilpangkat);
		//pembulatan
		double p = 79.52;
		long pp = Math.round(p);
		System.out.println(Math.round(p));
		System.out.println(pp);
		
		//negatif infinity
		double i = Double.NEGATIVE_INFINITY;
		System.out.println(i);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Math.round(i));
		
		//Positif Infinity
		double ii = 1.0/0;
		System.out.println(Math.round(ii));
		
		//NaN
		double nn = 0.0/0;
		System.out.println(Math.round(nn));
	}

}
