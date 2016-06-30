package com.pwsturk.meg.Decorator;

public class Tavukburger extends Burger {

	public Tavukburger() {
		// TODO Auto-generated constructor stub
		setAciklama("Tavuk Burger");
	}
	@Override
	public double fiyatlandir() {
		// TODO Auto-generated method stub
		return 6.95;
	}

}
