package com.training.CG.dp;

public class FacadeTester {

	private static  String getNonVegMenu() {
		// TODO Auto-generated method stub
		String menu=chickenbiryani;
	get.NonVegMenu(chickenbiryani);
	}

	private static String getVegMenu() {
		// TODO Auto-generated method stub
		String menu=vegbiryani;
	return menu;
	}
	public static void main(String args[]) {
		HotelKeeper hk=new HotelKeeper();
		hk.getVegMenu();
		hk.getNonVegMenu();
		System.out.println("VegMenu is:"+getVegMenu());
		System.out.println("NonVegMenu is:"+getNonVegMenu());
	}
}


	


