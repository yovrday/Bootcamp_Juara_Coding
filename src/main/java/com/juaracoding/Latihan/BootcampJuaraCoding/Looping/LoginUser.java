package com.juaracoding.Latihan.BootcampJuaraCoding.Looping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LoginUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> login = new HashMap<>();
		login.put("MR.1","12345");
		login.put("MR.2","23456");
		login.put("MR.3","34567");
		login.put("MR.4","456789");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan User :");
		String users = input.next();
		System.out.println("Masukan Pass :");
		String pass2 = input.next();
		for ( String benar : login.keySet()) {
		if (benar.equals(users)) {
			System.out.println("Berhasil Login");
			
		}
			else if (benar.equals(pass2)) {
			System.out.println("Berhasil Login");
			break;
		}
		else if (benar.equalsIgnoreCase(users))
		{
			System.out.println("Belum Terdaftar User");
			break;
		}
		else if (benar.equalsIgnoreCase(pass2))
		{
			System.out.println("Belum Terdaftar User");
			break;
		}
		
	}
	}
}
