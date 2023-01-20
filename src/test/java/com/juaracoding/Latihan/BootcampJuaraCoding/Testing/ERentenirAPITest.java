package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import org.testng.annotations.Test;

public class ERentenirAPITest {

	@Test(groups = {
			"login",
			"flow rentenir",
			"flow peminjam"
	})
	public void loginApiTest() {
		System.out.println("Periksa API Login...");
	}
	@Test(groups = "flow rentenir" )
	public void rentenirApiTest() {
		System.out.println("Periksa API Rentenir...");
	}
	@Test(groups = "flow peminjam" )
	public void peminjamApiTest() {
		System.out.println("Periksa API Peminjam...");
	}
	
}
