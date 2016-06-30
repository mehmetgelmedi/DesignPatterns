package com.pwsturk.meg.Observer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HisseSenedi hs = new HisseSenedi();
		HisseSonDeger hsd = new HisseSonDeger();
		HisseFark hf = new HisseFark();
		HisseOrtalama ho = new HisseOrtalama();
		hs.gostergeEkle(hsd);
		hs.gostergeEkle(hf);
		hs.gostergeEkle(ho);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Yeni hisse deðeri : ");
			double deger = sc.nextDouble();
			System.out.println("Hisse senedi " + deger + " olarak deðiþti...");
			hs.setHisseDegeri(deger);
		}
	}

}