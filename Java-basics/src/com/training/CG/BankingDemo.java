package com.training.CG;

public class BankingDemo {
public static void main(String args[]) {
	SavingAccount sav1=new SavingAccount(12000);
	sav1.deposit(1000);
	System.out.println(sav1.checkBalance());
	sav1.withdraw(7000);
	System.out.println(sav1.checkBalance());
}
}
