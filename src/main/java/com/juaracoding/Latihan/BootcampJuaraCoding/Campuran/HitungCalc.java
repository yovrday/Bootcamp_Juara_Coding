package com.juaracoding.Latihan.BootcampJuaraCoding.Campuran;
import com.juaracoding.Latihan.BootcampJuaraCoding.Collection.*;
public class HitungCalc {
	
	public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.calcu(10, 5);
	int hitung1 = calc.tambah;
	System.out.println(hitung1);
	int hitung2 = calc.kurang;
	System.out.println(Math.abs(hitung2));
	double hitung3 = calc.bagi;
	System.out.println(hitung3);
	int hitung4 = calc.kali;
	System.out.println(hitung4);
}
}
