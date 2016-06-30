package com.pwsturk.meg.Factory;

public class Main {

	public static void main(String[] args) {
		VTFactory vtFactory = new VTFactory();
		
		VT mysqlVT=vtFactory.getVT(VTTipi.mysql);
		VT mssqlVT=vtFactory.getVT(VTTipi.mssql);
		
		mysqlVT.baglan();
		mssqlVT.baglan();
	}
}
