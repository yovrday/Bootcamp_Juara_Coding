package com.juaracoding.Latihan.BootcampJuaraCoding.Interface;

public class Contoh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		cat.jenis();
		cat.suara();
		cat.bergerak();
		cat.beranak();
		
		BankInterface bankBCA = new BCA();
		System.out.println(bankBCA.ratingOfBank());
		
		BankInterface bankOCBC = new OCBC();
		System.out.println(bankOCBC.ratingOfBank());
	}

}
