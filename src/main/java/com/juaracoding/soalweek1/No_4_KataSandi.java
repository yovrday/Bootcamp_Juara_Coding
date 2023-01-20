package com.juaracoding.soalweek1;
import java.util.Scanner;
public class No_4_KataSandi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true ;
		String kata_sandi;
		int digit = 0;
		
		System.out.println("1. Kata sandi harus memiliki setidaknya delapan karakter.");
		System.out.println("2. Kata sandi hanya terdiri dari huruf dan angka.");
		System.out.println("3. Kata sandi harus berisi setidaknya dua digit.");
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan kata sandi   : ");
	    kata_sandi = scan.next();
	    
	    
	    for(int i = 0 ; i <kata_sandi.length(); i++)
        {
        if (!Character.isLetterOrDigit(kata_sandi.charAt(i))) {
        	System.out.print("Kata sandi invalid : "+kata_sandi);
        
        }
        if (kata_sandi.length()<8){
	        System.out.print("Kata sandi invalid : "+kata_sandi);
	        
	        }
        
	    for(i = 0 ; i <kata_sandi.length(); i++) {
        if ((Character.isDigit(kata_sandi.charAt(i)))) {
        	digit = digit + 1 ;
        }
	    }
        if (digit>=2) {
        System.out.println("Kata sandi valid : "+kata_sandi);
        }
        
        else
        System.out.print("Kata sandi invalid : "+kata_sandi);
        
        //}
        }
}
	}


