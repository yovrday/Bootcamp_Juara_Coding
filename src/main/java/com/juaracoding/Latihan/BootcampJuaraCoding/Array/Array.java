package com.juaracoding.Latihan.BootcampJuaraCoding.Array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nilai = {1,2,3,4,5};
		System.out.println(nilai[0]);
		System.out.println(nilai[2]);
		System.out.println(nilai.length);
		
		int [] kafe = new int [4];
		kafe[0] = 3;
		kafe[1] = 5;
		kafe[2] = 7;
		kafe[3] = 9;
	
		System.out.println(kafe[2]);
		
		String [] cars = {"Volvo","BMW","Ford"};
		
		for (int index = 0 ; index < cars.length; index++)
		{
			System.out.println(cars[index]);
		}
		
		for (String mobil : cars) {
		System.out.println(mobil);
		}
		
		
		
	}

}
