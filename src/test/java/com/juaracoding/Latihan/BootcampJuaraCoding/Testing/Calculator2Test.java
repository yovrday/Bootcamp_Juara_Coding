package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class Calculator2Test {

	@Test
	@Parameters ({"a","b"})
	public void hitungTest(int a, int b) {
		Calculator2 ct2 = new Calculator2();
		//int a = 10;
		//int b = 50;
		int expect = a + b ;
		//System.out.println(a);
		int actual = ct2.hitung(a,b);
		assertEquals(actual, a+b);
	}
}
