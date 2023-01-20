package com.juaracoding.Latihan.BootcampJuaraCoding.LinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class AbsenHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> absen = new HashSet<>();
		absen.add("Ab");
		absen.add("Ac");
		absen.add("Ad");
		absen.add("Ae");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nama Peserta");
		String namaPeserta = input.next();
		
		if (absen.contains(namaPeserta)) {
			System.out.println("Sudah absen");
		}
		else
		{
			System.out.println("Jangan lupa Absen");
		}
	}

}
