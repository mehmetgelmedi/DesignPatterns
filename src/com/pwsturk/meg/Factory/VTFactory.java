package com.pwsturk.meg.Factory;

public class VTFactory {
	public VT getVT(VTTipi vtTipi) {
		if (vtTipi == VTTipi.mssql) {
			return new MSSQL();
		} else if (vtTipi == VTTipi.mysql) {
			return new MYSQL();
		}
		return null;
	}
}
