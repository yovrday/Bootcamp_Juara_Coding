package com.juaracoding.Latihan.BootcampJuaraCoding.Looping;
import java.util.Scanner;
public class Latihan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner masuk = new Scanner(System.in);
		 	String [] nama1 = {"Java ","Sang ","Juara "};
			String [] nama2 = {"Para ","Juara ","Java "};
	        int i=0;
	        for (int index = 0 ; index < nama1.length; index++) {
	        	 while (i<=0) {
	        		 for (String nama3 : nama1) 
	        		 System.out.print(nama3);
	        		 i++;
	        	 }
	        	 System.out.println(nama2[index]);
	        }
	        
	}
}
//		String [] nama1 = {"Java ","Sang ","Juara "};
//		String [] nama2 = {"Para ","Juara ","Java "};
//
//		for (int index = 0 ; index < nama1.length; index++)
//		{
//			if (nama1.length>2) {
//			System.out.print(nama1[index]);
//			}
//			else {
//				System.out.print(nama2[index]);
//			}
//}