package com;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=2;
		int c=0;
		do {
			if(n%i==0)
				c++;
				
		}while(i<=n);
		if(c==1)
			System.out.println("Prime");

	}

}
