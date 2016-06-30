package com.pwsturk.meg.Decorator;

public abstract class EkstraBurger extends Burger {
	protected Burger burger;

	public EkstraBurger(Burger burger) {
		this.burger = burger;
	}

	public abstract String getAciklama();
}
