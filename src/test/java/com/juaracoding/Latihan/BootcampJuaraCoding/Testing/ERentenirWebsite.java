package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import org.testng.annotations.Test;

public class ERentenirWebsite {
	@Test(groups = {"login", "flow rentenir", "flow peminjam"})
	public void LoginAPITest() {
	System.out.println("Memeriksa API Web Login...");
	}
	@Test(groups = "flow rentenir")
	public void RentenirHomePageAPITest() {
	System.out.println("Memeriksa API beranda Web Rentenir...");
	}
	@Test(groups = "flow peminjam")
	public void PeminjamHomePageAPITest() {
	System.out.println("Memeriksa API beranda Web Peminjam...");
	}

}
