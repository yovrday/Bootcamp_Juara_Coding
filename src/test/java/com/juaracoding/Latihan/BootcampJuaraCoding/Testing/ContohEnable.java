package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import org.testng.annotations.Test;

public class ContohEnable {

	@Test (enabled = false)
	public void kali () {
		System.out.println("Methode Kali()");
	}
	@Test (enabled = true)//default juga true
	public void bagi () {
		System.out.println("Methode Bagi()");
	}
	
	@Test (timeOut = 1)
	public void tambah () {
		while (true)
		System.out.println("Method Tambah()");
	}
	@Test (timeOut = 200)
	public void kurang () {
		try {
		Thread.sleep(400);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
}
}
