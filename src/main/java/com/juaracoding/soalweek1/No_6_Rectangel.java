package com.juaracoding.soalweek1;

public class No_6_Rectangel {

	public static void main(String[] args) {
		
		System.out.println(rectangel(1.2,3.4));
		System.out.println(rectangel(1.0,1.0));
		System.out.println(rectangel(5.6,7.8));

	}
	static String rectangel (double l, double w)
	  {
		  System.out.println("Rectangle [length="+l+",width="+w+"]");

	      System.out.println("length is : "+l);
	      System.out.println("width is : "+w);
	      
	      double area = l * w;
	      double perimeter = (2.0 * l) + (2.0 * w);
	      
	      System.out.println("area is : "+(float)area);
	      System.out.println("perimeter is : "+(float)perimeter);
		  
		  return "" ; 
	  }
}
