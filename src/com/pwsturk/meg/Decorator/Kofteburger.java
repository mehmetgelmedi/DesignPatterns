package com.pwsturk.meg.Decorator;

public class Kofteburger extends Burger {

	public Kofteburger() {
		// TODO Auto-generated constructor stub
		setAciklama("K�fte Burger");
	}

	@Override
	public double fiyatlandir() {
		// TODO Auto-generated method stub
		return 8.95;
	}

}
