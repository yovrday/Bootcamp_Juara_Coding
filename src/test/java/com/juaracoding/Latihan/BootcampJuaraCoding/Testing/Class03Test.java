package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Class03Test {

	@BeforeTest
	public void beforetest () {
		System.out.println("beforeTest");
	}
	@AfterTest
	public void aftertest () {
		System.out.println("afterTest");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforeSuite");
	}
	@AfterSuite
	public void aftersuite () {
		System.out.println("afterSuite");
	}
}
