package com.juaracoding.Latihan.BootcampJuaraCoding.Looping;

import java.util.Scanner;

public class Perulangan {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner Key = new Scanner(System.in);
		System.out.print("Input Angka = ");
		b	= Key.nextInt();
		System.out.println();
		
		for (a=1; a<=b; a++) {
		for ( c=1; c<=a;c++){
		System.out.print(a+"");
		}
		System.out.println();
	}

	}
}
