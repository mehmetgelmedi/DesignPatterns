package com.pwsturk.meg.Decorator;

public class Hamburger extends Burger {

	public Hamburger() {
		// TODO Auto-generated constructor stub
		setAciklama("Hamburger");
	}

	@Override
	public double fiyatlandir() {
		// TODO Auto-generated method stub
		return 7.95;
	}

}
