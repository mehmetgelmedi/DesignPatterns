package com.pwsturk.meg.Adapter;

public class RobotAdapter implements Dusman {

	private DusmanRobot dr;

	public RobotAdapter() {
		dr = new DusmanRobot();
	}

	@Override
	public void silahKullan() {
		dr.yumrukAt();

	}

	@Override
	public void hizlan() {
		dr.yuru();

	}

	@Override
	public void dusmanAdi(String ad) {
		dr.robotAdi(ad);

	}

}
