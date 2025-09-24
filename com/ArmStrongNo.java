package com;
import java.util.*;
public class ArmStrongNo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no :");
        int n=sc.nextInt();
        int s=0,d=0;
        int noo=n;
        int exp=powCalculate(n);
        while(n>0)
        {
            d=n%10;
            s+=CalculateSum(d,exp);
            n=n/10;
        }
        if(s==noo)
        {
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("Not ArmStrong");
        }

	}
	 static int powCalculate(int num){
	      int c=0;
	        while(num>0)
	        {
	            c=c+1;
	            num=num/10;
	        }
	        return c;
	    }
	    static int CalculateSum(int base ,int ex)
	    {
	        int pow=1;
	        for(int i=1;i<=ex;i++)
	        {
	            pow*=base;
	        }
	        return pow;
	    }


}
