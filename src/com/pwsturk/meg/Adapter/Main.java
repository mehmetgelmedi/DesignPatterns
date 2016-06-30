package com.pwsturk.meg.Adapter;

public class Main {

	public static void main(String[] args) {
		RobotAdapter robotAdapter=new RobotAdapter();
		
		robotAdapter.dusmanAdi("Robo47");
		robotAdapter.silahKullan();
		robotAdapter.hizlan();
		
		DusmanTank dusmanTank =new DusmanTank();
		
		dusmanTank.dusmanAdi("Cop33");
		dusmanTank.silahKullan();
		dusmanTank.hizlan();
	}
}
