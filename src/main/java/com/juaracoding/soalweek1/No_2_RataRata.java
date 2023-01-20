package com.juaracoding.soalweek1;
import java.util.Scanner;

public class No_2_RataRata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double angka1,angka2,angka3;
		double hasil;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan angka pertama   : ");
        angka1 = scan.nextDouble();
        System.out.print("Masukan angka kedua   : ");
        angka2 = scan.nextDouble();
        System.out.print("Masukan angka ketiga   : ");
        angka3 = scan.nextDouble();
        
        
        hasil = (angka1 + angka2 + angka3) / 3;
        System.out.print("Nilai summary adalah   : "+hasil);
	}

}
