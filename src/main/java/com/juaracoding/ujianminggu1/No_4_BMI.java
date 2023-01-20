package com.juaracoding.ujianminggu1;
import java.util.Scanner;
public class No_4_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.print("Masukan weight : ");
	      double berat = sc.nextDouble();
	      System.out.print("Masukan height : ");
	      double tinggi = sc.nextDouble();
	      
	      double BMI = berat / (tinggi * tinggi);
	      
	      System.out.print("BMI adalah " +BMI);
	}

}
