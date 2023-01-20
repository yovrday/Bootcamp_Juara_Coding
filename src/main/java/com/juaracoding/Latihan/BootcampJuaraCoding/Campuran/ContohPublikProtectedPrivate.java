package com.juaracoding.Latihan.BootcampJuaraCoding.Campuran;
import com.juaracoding.Latihan.BootcampJuaraCoding.Collection.*;
public class ContohPublikProtectedPrivate {

	public String name ;
	public void changename (String name ) {
		this.name = name;
	}
	
	public void panggilchangename (String name) {
		this.changename(name);
	}
	
	protected String name1 ;
	protected void changename1 (String name1 ) {
		this.name = name1;
	}
	
	protected void panggilchangename1(String name1) {
		this.changename1(name1);
	}
	private String name2 ;
	private void changename2 (String name2 ) {
		this.name = name2;
	}
	private void panggilchangename2(String name2) {
		this.changename1(name2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	ContohPublik = cp = new ContohPublik ;
//	cp.name = "Uhuy";
//	Susyrm.out.println(cp,name);
//	cp.changename("Asep");
//	Susyrm.out.println(cp,name);
}

