package com.pwsturk.meg.Decorator;

public class TavukKanat extends EkstraBurger {

	public TavukKanat(Burger burger) {
		super(burger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fiyatlandir() {
		// TODO Auto-generated method stub
		return 4.95 + burger.fiyatlandir();
	}

	@Override
	public String getAciklama() {
		// TODO Auto-generated method stub
		return burger.getAciklama() + ",Tavuk Kanat";
	}

}
