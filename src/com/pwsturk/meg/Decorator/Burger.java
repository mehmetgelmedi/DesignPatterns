package com.pwsturk.meg.Decorator;

public abstract class Burger {
	private String aciklama;

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getAciklama() {
		return aciklama;
	}

	public abstract double fiyatlandir();
}
