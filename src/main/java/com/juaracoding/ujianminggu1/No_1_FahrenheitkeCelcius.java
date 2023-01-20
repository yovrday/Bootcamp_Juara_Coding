package com.juaracoding.ujianminggu1;
import java.util.Scanner;
public class No_1_FahrenheitkeCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c ;
		double f ;
		Scanner input = new Scanner(System.in);
	 
	    System.out.print("Masukan Suhu Fahrenheit: ");
	    f = input.nextDouble();
	    c = (5.0/9.0) * (f - 32.0);
	   
	    System.out.println(f+" F Sama Dengan "+c+" C");
	}

}
