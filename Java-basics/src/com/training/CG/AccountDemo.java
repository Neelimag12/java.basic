package com.training.CG;

 import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;
	import java.util.TreeSet;

	public class AccountDemo {

		public static void main(String[] args) {
			
			SavingAccount s1= new SavingAccount(5000);
			s1.deposit(6000);
			s1.withdraw(2000);
			
			SavingAccount s2=new SavingAccount(3000);
			s2.deposit(2000);
			s2.withdraw(1000);
			
			SavingAccount s3=new SavingAccount(8000);
			s3.deposit(4000);
			s3.withdraw(5000);
			
			SavingAccount s4=new SavingAccount(3000);
			s4.deposit(1000);
			s4.withdraw(500);
			
			Set<SavingAccount> savingaccounts= new HashSet<SavingAccount>();
			Set<SavingAccount> savingaccounts1= new TreeSet<SavingAccount>();
			savingaccounts.add(s1);
			savingaccounts.add(s2);
			savingaccounts.add(s3);
			savingaccounts.add(s4);
			
		//	for(SavingAccount s:savingaccounts) {
				//System.out.println(s.));
			//}
			Iterator<SavingAccount> it= savingaccounts.iterator();
			while(it.hasNext()) {
			
				System.out.println(it.next().checkBalance());
				
			}
			
		}
	}

