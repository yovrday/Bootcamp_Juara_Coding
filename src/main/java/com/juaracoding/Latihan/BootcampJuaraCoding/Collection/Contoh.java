package com.juaracoding.Latihan.BootcampJuaraCoding.Collection;

public class Contoh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student siswa [] = new Student[10];	siswa = new Student[10];
		
		for (int i = 0 ; 1<siswa.length; i++) {
			int counter = i+1;
			siswa [0] = new Student ("01"+counter,""+counter, counter+"email@com");
		}
		
//		System.out.println(siswa[0].getId());
//		System.out.println(siswa[0].getName());
//		System.out.println(siswa[0].getEmail());
		for (Student s : siswa) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println("===================");
		}
		}

}
