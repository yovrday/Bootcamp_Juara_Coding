package com.juaracoding.soalweek1;
import java.util.Scanner;
public class No_3_HitungHurufVocal {

public static void main (String [ ] args ) {	
	
	String kalimat;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;
	Scanner scan = new Scanner(System.in);
	System.out.print("Masukan string   : ");
    kalimat = scan.next();
    

    for(int x=0; x<kalimat.length();x++){
        if(kalimat.charAt(x)=='a'){
            a++;
        }
        if(kalimat.charAt(x)=='i'){
            b++;
        }
        if(kalimat.charAt(x)=='u'){
            c++;
        }
        if(kalimat.charAt(x)=='e'){
            d++;
        }
        if(kalimat.charAt(x)=='o'){
            e++;
        }
    }
    System.out.println("Number of Vowels in the string : "+(a+b+c+d+e));
}
}
