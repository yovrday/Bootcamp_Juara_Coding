package com.juaracoding.Latihan.BootcampJuaraCoding.Array;

public class ArraySoal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nama = {" Dewabrata "," Ahmad Aqil "," Hanif "," Koswara "," Paulus "," Yudha "," Dewi "," Desi "};
		String panggil = nama [3];
		System.out.println("Nama - Nama Siswa");
		System.out.println(".................");
		for (int index = 0 ; index < nama.length; index++)
		{
			System.out.print(nama[index]);
			System.out.print(", ");
		}
		System.out.println();
		System.out.println(".................");
		System.out.println("Jumlah Siswa = "+nama.length+" Dan Yang Di Panggil = "+panggil);
	}

}
