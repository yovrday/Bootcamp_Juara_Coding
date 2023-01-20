package com.juaracoding.ujianminggu1;
import java.util.Scanner;
public class No_2_IncikeMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		
		Scanner inci = new Scanner(System.in);
		System.out.print("Masukan nilai dalam inch = ");
		x = inci.nextDouble();
		
		y = x*254/100;
		
		System.out.println(x+" inch adalah = "+y+" meter ");
		
	}

}
