package com.training.CG;

public class CurrentAccount implements Account {
final double initialbalance=12000;
double totalbalance;
final double RateOfInterest=4;
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		totalbalance=(initialbalance+amount);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(totalbalance<amount) {
			System.out.println("insufficien balance");
		}
		else {
			totalbalance=(initialbalance-amount);
		}
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return totalbalance;
	}

}
