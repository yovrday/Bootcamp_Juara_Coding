package com.juaracoding.Latihan.BootcampJuaraCoding.Looping;

public class Penilaian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nilaiAkhir = 75.0;
		char grade;
		
		//na >= 80 => A
		//na >= 70 => B
		//na >= 60 => C
		//na >= 50 => D
				
		if (nilaiAkhir >=80)	{
			grade = 'A';
			}
		else if (nilaiAkhir >=70) {
			grade = 'B';
		}
		else if (nilaiAkhir >=60) {
			grade = 'C';
		}
		else if (nilaiAkhir >=50) {
			grade = 'D';
		}
		else {
			grade = 'E';
		}
		
		System.out.println(grade);
		}

}
