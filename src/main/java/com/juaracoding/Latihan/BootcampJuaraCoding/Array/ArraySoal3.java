package com.juaracoding.Latihan.BootcampJuaraCoding.Array;

public class ArraySoal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nama = {" Dewabrata "," Ahmad Aqil "," Hanif "," Koswara "," Paulus "};
		System.out.println("Nama - Nama Siswa");
		System.out.println(".................");
		
		for (int index = 0 ; index < nama.length; index++)
		{
			System.out.print(nama[index]);
		}
		System.out.println();
		System.out.println(".................");    //+panggil
		System.out.println("Siswa Yang Di Panggil = "+nama[1]);
	}

}
