package com.pwsturk.meg.Observer;

import java.util.ArrayList;

public class HisseSenedi implements Gozlenen {
	private double hisseDegeri;

	private ArrayList<Gosterge> gostergeler;

	public HisseSenedi() {
		// TODO Auto-generated constructor stub
		this.gostergeler = new ArrayList<>();
	}

	public double getHisseDegeri() {
		return hisseDegeri;
	}

	public void setHisseDegeri(double hisseDegeri) {
		this.hisseDegeri = hisseDegeri;
		gostergeBildir();
	}

	@Override
	public void gostergeEkle(Gosterge gosterge) {
		// TODO Auto-generated method stub
		this.gostergeler.add(gosterge);
	}

	@Override
	public void gostergeKaldir(Gosterge gosterge) {
		// TODO Auto-generated method stub
		this.gostergeler.remove(gosterge);
	}

	@Override
	public void gostergeBildir() {
		// TODO Auto-generated method stub
		for (Gosterge gosterge : gostergeler) {
			gosterge.guncelle(hisseDegeri);
		}
	}

}
