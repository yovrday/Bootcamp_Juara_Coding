package com.juaracoding.Latihan.BootcampJuaraCoding.Collection;

import java.util.ArrayList;

public class belajarAnalyst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> daftarmobil = new ArrayList<String>();
//		daftarmobil.add("Volvo");
//		daftarmobil.add("Volvo");
//		daftarmobil.add("Volvo");
		
		for (int i = 0; i < 6 ; i++){
			daftarmobil.add("Mobil ke"+ (i+1));
		}
		
		daftarmobil.add(2, "Unyu");
		//mengubah
		daftarmobil.set(0, "Toyota");
		//hapus atau clear
		daftarmobil.remove(2);
		daftarmobil.remove("Mobil ke 3");
		
		if(daftarmobil.remove("Mobil ke 4")) {
			System.out.println("Yeay Dihapus");
		}
		else {
			System.out.println("Coba Check");
		}
		daftarmobil.clear();
		
		System.out.println(daftarmobil.size());
		
		for (int i = 0 ; i < daftarmobil.size(); i++) {
			System.out.println(daftarmobil.get(i));
		}
		for (String data : daftarmobil) {
			System.out.println();
		}
	}

}
