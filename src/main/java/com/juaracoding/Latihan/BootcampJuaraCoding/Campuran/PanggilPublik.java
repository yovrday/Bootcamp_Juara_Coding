package com.juaracoding.Latihan.BootcampJuaraCoding.Campuran;
import com.juaracoding.Latihan.BootcampJuaraCoding.Collection.*;
public class PanggilPublik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public
		ContohPublikProtectedPrivate cp = new ContohPublikProtectedPrivate() ;
		cp.name = "Uhuy";
		System.out.println(cp.name);
		cp.changename("Asep");
		System.out.println(cp.name);
		//protected
		ContohPublikProtectedPrivate cp1 = new ContohPublikProtectedPrivate() ;
		cp1.name1 = "Uhuy";
		System.out.println(cp1.name1);
		cp1.changename1("Asep");
		System.out.println(cp1.name1);
		//private
//		ContohPublikProtectedPrivate cp2 = new ContohPublikProtectedPrivate() ;
//		cp1.name2 = "Uhuy";
//		System.out.println(cp2.name2);
//		cp1.changename2("Asep");
//		System.out.println(cp2.name2);
		//no
		
		
		//constructor
//		/Mobil2 avanza2 = new Mobil2 ();
//		new Mobil2 ();
		
		Mobil avanza = new Mobil ("Solar",2022);
		avanza.warna();
		avanza.mesin();
		int tahun = avanza.gettahunpembuatan();
		String bbakar = avanza.getbahanbakar();
	}
}