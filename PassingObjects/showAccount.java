package PassingObjects;

import java.util.Scanner;

public class showAccount {
	static void showInfo(Account a)
	{
		if(a!= null)
		{
			System.out.println("Account number :"+a.Account_no);
			System.out.println("Account balance :"+a.Account_balance);
		}
	}
	static Account createAccount()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Account no: ");
		long Account_no=scanner.nextLong();
		System.out.println("Enter the Accoount Balnace :");
		double Account_balance=scanner.nextDouble();
		Account account=new Account(Account_no, Account_balance);
		return account;
	}
}
