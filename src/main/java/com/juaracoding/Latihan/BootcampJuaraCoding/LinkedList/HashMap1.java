package com.juaracoding.Latihan.BootcampJuaraCoding.LinkedList;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> user = new HashMap<>();
		
		user.put("001", "Budi Ando");
		user.put("002", "Andi Ando");
		
		System.out.println(user);
		System.out.println(user.get("001"));
		System.out.println(user.keySet());
		System.out.println(user.values());
		
		for (String ket : user.keySet()) {
			System.out.println(user.get(ket));
		}
//		HashMap<String, Pelanggan> user = new HashMap<>();
//		
//		user.put("001", "Budi Ando");
//		user.put("002", "Andi Ando");
	}
	
	

}
