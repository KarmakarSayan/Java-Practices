package com;

public class duck_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=054;
		int d=0;
		int prod=1;
		while(n>0)
		{
			d=n%10;
			prod*=d;
			n=n/10;
		}
		if(prod==0)
		{
			System.out.println("Duck No");
		}
		else {
			System.out.println("Not a Duck No");
		}
	}

}
