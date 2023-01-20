package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import org.testng.annotations.Test;

public class SimpleTestCase {

	@Test (dependsOnMethods = {"bTest"})//diproitaskan
	public void aTest(){
		int sum = 0;
		int a = 10 ;
		int b = 5;
		System.out.println(a+b);
	}
	
	
	@Test
	public void bTest(){
		int sum = 0;
		int a = 15 ;
		int b = 5;
		System.out.println(a+b);
	}
}
