package com.training.CG;

public class AccountType implements Account {
final double initialbalance=12000;
double totalbalance;
final double RateOfInterest=4;
public void deposit(double amount) {
	// TODO Auto-generated method stub
	totalbalance=(totalbalance+amount);
}

public void withdraw(double amount) {
	// TODO Auto-generated method stub
	if(amount>totalbalance) {
		System.out.println("insufficient balance");
	}
	else {
		totalbalance=(totalbalance-amount);
	}
}

public double checkBalance() {
	// TODO Auto-generated method stub
	return totalbalance;
}


}
