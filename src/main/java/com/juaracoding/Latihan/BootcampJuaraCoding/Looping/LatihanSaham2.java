package com.juaracoding.Latihan.BootcampJuaraCoding.Looping;

import java.util.Scanner;

public class LatihanSaham2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double harga = 4100;
		double jumlah;
		double hb ;
		double hasil;
		double hjual;
		double hjual2;
		double hjual3;
		double hbeli = 6160955;
		String jual;
		double quantity;
		
		Scanner Key = new Scanner(System.in);
		System.out.print("Input Beli Lot Saham= ");
		jumlah = Key.nextDouble();
		hb = jumlah * 100 * harga;
		hasil = hb + ( hb * 0.017/100);
		
		System.out.println("Harga Beli Adalah = Rp." +hb);
		System.out.println("Harga Beli Saham Adalah = Rp." +hasil);
		
		System.out.print("Input Jual Lot Saham = ");
		quantity = Key.nextDouble();
		hjual = 4200 * 	quantity *	100;
		hjual2 = hjual - ( hjual *0.027/100);
		hjual3 = hjual2 - hbeli;
		
		System.out.println("Harga Jual Adalah = Rp."+hjual2);
		System.out.println("Harga Jual Saham Adalah = Rp."+hjual3);
		
		if (hjual3>=300000)	{
			jual = ("Ayo Diambil Aja Bos");
			}
		else {
			jual = ("Jangan Diambil Bos");
		}
		
		System.out.println(jual);
		}
	}

