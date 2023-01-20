package com.juaracoding.Latihan.BootcampJuaraCoding.Looping;

import java.util.Scanner;

public class LatihanSaham1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double harga = 4100;
				double jumlah;
				double hb ;
				double hasil;
				
				Scanner Key = new Scanner(System.in);
				System.out.print("Input Jumlah Lot= ");
				jumlah = Key.nextDouble();
				hb = jumlah * 100 * harga;
				hasil = hb + ( hb * 0.017/100);
				
				System.out.println("Harga Beli Adalah = Rp." +hb);
				System.out.println("Harga Beli Saham Adalah = Rp." +hasil);
//				
//				System.out.print("Input Jumlah Lot= ");
//				quantity = Key.nextDouble();
//				hb = quantity * 100 * harga;
//				jumlah = hb + ( hb * 0.017/100);
//				
//				System.out.println("Harga Beli Adalah = Rp." +hb);
//				System.out.println("Harga Beli Saham Adalah = Rp." +jumlah);
			
			}

		

	}


