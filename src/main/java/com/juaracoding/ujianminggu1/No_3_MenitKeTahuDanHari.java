package com.juaracoding.ujianminggu1;
import java.util.Scanner;
public class No_3_MenitKeTahuDanHari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double menit;
		double tahun ;
		double hari ;
		int sisatahun;
		int sisahari;
		
		Scanner waktu = new Scanner(System.in);
		System.out.print("Masukan Menit   : ");
        menit = waktu.nextInt();
        
        tahun = ((menit*1.0)/525960);
        hari = ((menit*1.0)/1440);
        
        sisatahun = (int)hari % (int)tahun ;
        sisahari = (int)tahun % (int)hari ;
        
        System.out.println("Hasilnya = "+(int)sisatahun+" tahun "+(int)sisahari+" hari");
	}

}
