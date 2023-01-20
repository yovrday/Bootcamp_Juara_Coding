package com.juaracoding.Latihan.BootcampJuaraCoding.Super;

public class Anak extends Ayah{
public int age;

Anak(String nama, String alamat,int age){
	super(nama,alamat);
	this.age = age;
}
void cetak () {
	super.cetak();
	System.out.println(this.age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
