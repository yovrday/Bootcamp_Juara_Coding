package com.juaracoding.ujianminggu1;
import java.util.Scanner;
public class No_5_HitungKecepatan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jarak,jam,menit,detik ; 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Masukan jarak dalam meter : ");
		jarak = scan.nextInt();
		System.out.println("Masukan jam : ");
		jam = scan.nextInt();
		System.out.println("Masukan menit : ");
		menit = scan.nextInt();
		System.out.println("Masukan detik : ");
		detik = scan.nextInt();
		
		double waktudetik = (jam*3600) + (menit*60) + detik;
		
		double waktujam = (detik/3600)+ (menit/60) + jam;
		
		double hasil = (jarak*1.0) / waktudetik ;
		double hasil2 = (jarak/1000.0) / waktujam ;
		double hasil3 = (jarak*1000.0) / waktujam ;
		
		System.out.println("Kecepatan dalam meter/second adalah : "+hasil);
		System.out.println("Kecepatan dalam km/h adalah : "+hasil2);
		System.out.println("Kecepatan dalam mil/h adalah : "+hasil3);
	}

}
