package com.pwsturk.meg.Singleton;

public class Singleton {
	private static Singleton nesne;

	private Singleton() {
	}

	public static Singleton getNesne() {
		if (nesne == null) {
			nesne = new Singleton();
			System.out.println("Nesne oluþturuldu..");
		}else{
			System.out.println("Var olan nesne..");
		}
		return nesne;
	}
}
