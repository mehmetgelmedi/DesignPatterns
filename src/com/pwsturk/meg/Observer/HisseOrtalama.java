package com.pwsturk.meg.Observer;

public class HisseOrtalama implements Gosterge {

	private double ortalama = 0;
	private int sayac = 0;

	@Override
	public void guncelle(double hisseDegeri) {
		// TODO Auto-generated method stub
		if (sayac < 4) {
			ortalama += hisseDegeri;
			sayac++;
		} else {
			ortalama /= 5;
			System.out.println("Hisse'nin son 5 deðeri'nin ortalamasý : " + ortalama);
			ortalama = 0;
			sayac = 0;
		}

	}

}
