package com.juaracoding.soalweek1;
import java.util.Scanner;
public class No_5_AreaPentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int js ;
		int s ;
		double pentagon;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan jumlah sisi : ");
		js = scan.nextInt();
		System.out.println("Masukan sisi : ");
		s = scan.nextInt();
		pentagon=(js*s*s)/(4*Math.tan(Math.PI/js));
		
		System.out.println("area dari pentagon adalah "+pentagon);
	}

}
