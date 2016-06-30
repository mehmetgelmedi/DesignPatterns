package com.pwsturk.meg.Decorator;

public class Patates extends EkstraBurger {

	public Patates(Burger burger) {
		super(burger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fiyatlandir() {
		// TODO Auto-generated method stub
		return 2.95 + burger.fiyatlandir();
	}

	@Override
	public String getAciklama() {
		// TODO Auto-generated method stub
		return burger.getAciklama() + ",Patates";
	}

}
