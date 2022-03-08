package com.training.CG;

public  class SavingAccount extends AccountType{
double initialbalance;
	//double totalbalance;
final double RateOfInterest=4;
SavingAccount(double initialbalance){
	this.initialbalance=initialbalance;
	this.totalbalance=initialbalance;
}
}
