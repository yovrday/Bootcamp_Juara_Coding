package com.juaracoding.Latihan.BootcampJuaraCoding.LinkedList;

import java.util.HashSet;

public class BelajarHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> data = new HashSet<>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(2);
		
		
		
		if (data.contains(2)) {
			System.out.println("Ada");
		}
		else {
			System.out.println("Gaada");
		}
	}

}
