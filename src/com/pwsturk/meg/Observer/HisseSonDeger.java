package com.pwsturk.meg.Observer;

public class HisseSonDeger implements Gosterge {

	private double hisseSonDeger = 0;

	@Override
	public void guncelle(double hisseDegeri) {
		// TODO Auto-generated method stub
		System.out.println("Hisse son deðeri : " + hisseSonDeger);
		hisseSonDeger = hisseDegeri;
	}

}
