package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class02Test {

	@BeforeClass
	public void iniBeforeClass02 ( ) {
		System.out.println("Ini BeforeClass dari Class 02");
	}
	
	@AfterClass
	public void iniAfterClass02 ( ) {
		System.out.println("Ini AfterClass dari Class 02");
	}
	
	
	@BeforeMethod
	public void iniBeforeMethod02 ( ) {
		System.out.println("Ini BeforeMethod dari Class 02");
	}
	
	@AfterMethod
	public void iniAfterMethod02 ( ) {
		System.out.println("Ini AfterMethod dari Class 02");
	}
	
	@Test
	public void a02Test () {
		System.out.println("a02Test");
	}
	@Test
	public void b02Test  () {
		System.out.println("b02Test");
	}
	
}
