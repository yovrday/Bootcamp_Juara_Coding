package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class01Test {
	@BeforeClass
	public void iniBeforeClass01 ( ) {
		System.out.println("Ini BeforeClass dari Class 01");
	}
	
	@AfterClass
	public void iniAfterClass01 ( ) {
		System.out.println("Ini AfterClass dari Class 01");
	}
	
	@BeforeMethod
	public void iniBeforeMethod01 ( ) {
		System.out.println("Ini BeforeMethod dari Class 01");
	}
	
	@AfterMethod
	public void iniAfterMethod01 ( ) {
		System.out.println("Ini AfterMethod dari Class 01");
	}
	
	@Test
	public void a01Test () {
		System.out.println("a01Test");
	}
	@Test
	public void b01Test  () {
		System.out.println("b01Test");
	}
}
