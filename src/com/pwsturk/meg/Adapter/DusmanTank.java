package com.pwsturk.meg.Adapter;

public class DusmanTank implements Dusman {

	@Override
	public void silahKullan() {
		System.out.println("D��man tank� sald�rd�");

	}

	@Override
	public void hizlan() {
		System.out.println("D��man tank� harekete ge�ti");

	}

	@Override
	public void dusmanAdi(String ad) {
		System.out.println("Tank Ad� : " + ad);

	}

}
