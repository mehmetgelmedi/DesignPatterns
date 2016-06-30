package com.pwsturk.meg.Observer;

public class HisseFark implements Gosterge {
	private double hisseOncekiDeger;

	@Override
	public void guncelle(double hisseDegeri) {
		// TODO Auto-generated method stub
		double hisseFarki = ((hisseDegeri - hisseOncekiDeger) / hisseOncekiDeger) * 100;
		System.out.println("Hisse farký : %" + hisseFarki);
		hisseOncekiDeger = hisseDegeri;
	}

}
