package com.training.CG.dp;

public class NonVegRestaurant implements Hotel {

	@Override
	public Menu getMenus() {
		// TODO Auto-generated method stub
		NonVegMenu nvm=new NonVegMenu();
		return nvm;

	
	}

}
