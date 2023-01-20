package com.juaracoding.Latihan.BootcampJuaraCoding.Array;
import java.util.Scanner;
public class ArraySoal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};	
		
		Scanner scan = new Scanner(System.in);
		int angka ;
		System.out.println("Input = ");
		angka = scan.nextInt();
		angka = arr  [2];
		System.out.println(angka);
		System.out.println("===========");
		
		System.out.println("Input = ");
		angka = scan.nextInt();
		angka = arr2 [2];
		System.out.println(angka);
	}

}
