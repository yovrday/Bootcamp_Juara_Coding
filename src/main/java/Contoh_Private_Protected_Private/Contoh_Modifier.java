package Contoh_Private_Protected_Private;

import com.juaracoding.Latihan.BootcampJuaraCoding.Campuran.*;

public class Contoh_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContohPublikProtectedPrivate cp = new ContohPublikProtectedPrivate() ;
		cp.name = "Uhuy";
		System.out.println(cp.name);
		cp.changename("Asep");
		System.out.println(cp.name);
		//protected beda package
//		ContohPublikProtectedPrivate cp1 = new ContohPublikProtectedPrivate() ;
//		cp1.name1 = "Uhuy";
//		System.out.println(cp1.name1);
//		cp1.changename1("Asep");
//		System.out.println(cp1.name1);
		
}

}
