package com.juaracoding.Latihan.BootcampJuaraCoding.Testing;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEqualsNoOrder;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	@BeforeMethod
	public void iniBeforeMethod ( ) {
		System.out.println("Ini Before");
	}
	
	@AfterMethod
	public void iniAfterMethod ( ) {
		System.out.println("Ini After");
	}
	
  @Test
  public void addTest() {
	  System.out.println("addTest()");
	  int a = 10;
	  int b = 20;
	  int expect = 30;
	  int actual = Calculator.add(a, b);
	  assertEquals(actual, expect );
  }
  
  @Test
  public void substractTest() {
	  System.out.println("substractTest()");
	  int a = 10;
	  int b = 20;
	  int expect = -10;
	  int actual = Calculator.substract(a, b);
	  assertEquals(actual, expect);
  }
  
  @Test
  public void angkaGedeTest () {
	  System.out.println("angkaGedeTest");
	  int a = 10;//false, karna a nilainya lebih kecil dari b
	  int b = 20;
	  boolean actual = Calculator.angkaGede(a, b);
	  assertTrue(actual);
  }
  
  
//  @Test
//  public void arrayTest() {
//	  ArrayList <String> daftarmobil1 = new ArrayList<String>();
//	  ArrayList <String> daftarmobil2 = new ArrayList<String>();
//	  
//	  daftarmobil1.add("Mobil A");
//	  daftarmobil1.add("Mobil B");
//	  daftarmobil2.add("Mobil A");
//	  daftarmobil2.add("Mobil B");
//	  
//	  assertEqualsNoOrder(daftarmobil1, daftarmobil2);
//  }
//  
//  @Test
//  public void negativeTest () {
//	  ArrayList <String> dpo = new ArrayList<String>();
//	  dpo.add("Budi");
//	  dpo.add("Ani");
//	  
//	  String pencarianorang = "Fikri";
//	  
//	  assertFalse(dpo.contains(pencarianorang));
//  }
//
//  
//  @Test
//public void instanceTest () {
//	  Student std1 = new Student ("001", "Budi", "budi12gmail@com");
//	  //Student std2 = std1 ; // contoh sama data
//	  Student std3 = new Student ("002", "Any", "any12gmail@com");
//	  
//	  //assertSame(std1, std3);//ini sama data
//	  assertNotSame(std1, std3);// ini harus beda data
//  }
//
//  @Test
//  public void divisionZeroTest ( ) {
//	  int a = 1 / 0 ;
//  }

}






