package com.training.CG.dp;

public class VegRestaurant implements Hotel {

	@Override
	public Menu getMenus() {
		// TODO Auto-generated method stub
		VegMenu vm=new VegMenu();
		return vm;
	}
	

}
