package com;
import  java.util.*;
public class spy_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A no");
		int n=sc.nextInt();
		int d=0,s=0,p=1;
		while(n>0)
		{
			d=n%10;
			s+=d;
			p*=d;
			n=n/10;
		}
		if(s==p) {
			System.out.println("Spy no");
		}
		else {
			System.out.println("Not spy no ");
		}
//Spy no.is a number that is the sum and products of digits are same 
	}

}
