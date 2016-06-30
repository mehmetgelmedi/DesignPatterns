package com.pwsturk.meg.Decorator;

public class SoganHalkasi extends EkstraBurger {

	public SoganHalkasi(Burger burger) {
		super(burger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fiyatlandir() {
		// TODO Auto-generated method stub
		return 1.95 + burger.fiyatlandir();
	}

	@Override
	public String getAciklama() {
		// TODO Auto-generated method stub
		return burger.getAciklama() + ",Soðan Halkasý";
	}

}
