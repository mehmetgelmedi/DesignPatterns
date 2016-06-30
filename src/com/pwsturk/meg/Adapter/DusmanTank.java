package com.pwsturk.meg.Adapter;

public class DusmanTank implements Dusman {

	@Override
	public void silahKullan() {
		System.out.println("Düþman tanký saldýrdý");

	}

	@Override
	public void hizlan() {
		System.out.println("Düþman tanký harekete geçti");

	}

	@Override
	public void dusmanAdi(String ad) {
		System.out.println("Tank Adý : " + ad);

	}

}
