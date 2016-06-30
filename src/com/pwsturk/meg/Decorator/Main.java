package com.pwsturk.meg.Decorator;

public class Main {

	public static void main(String[] args) {
		Burger ham = new Hamburger();
		ham = new Patates(ham);
		ham = new TavukKanat(ham);
		ham = new SoganHalkasi(ham);

		System.out.println("Açýklama : " + ham.getAciklama() + " -> Fiyat : " + ham.fiyatlandir());
		
		Burger kofte =new Kofteburger();
		kofte=new Patates(new Patates(kofte)); // double patates
		kofte=new SoganHalkasi(kofte);
		
		System.out.println("Açýklama : " + kofte.getAciklama() + " -> Fiyat : " + kofte.fiyatlandir());
		

	}

}
