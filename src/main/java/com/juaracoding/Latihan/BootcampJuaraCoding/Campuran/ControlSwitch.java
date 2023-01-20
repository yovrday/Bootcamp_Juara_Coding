package com.juaracoding.Latihan.BootcampJuaraCoding.Campuran;

public class ControlSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 90;
		
		switch (n) {
		case 1 :
			System.out.println("Ini 1");
			break;
		case 2 :
			System.out.println("Ini 2");
			break;
			default :
			System.out.println("Ini 3 dan seterusnya");
			break;
			
		}
		
		switch (m) {
		case 100:
			System.out.println("Excelent.");
			break;
		case 90:
			System.out.println("Mayan.");
			break;
		case 80:
			System.out.println("Aman.");
			break;
			default :
			System.out.println("Kureng");
			break;
			
		}
	}
	


}
