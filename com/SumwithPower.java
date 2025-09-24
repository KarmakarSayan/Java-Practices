package com;

public class SumwithPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1423;
        int s=0;
        int d=0;
        int exp=2;

        while(n>0){
            d=n%10;
            s+=power(d,exp);
            n=n/10;
        }
        System.out.println(s);

	}
	static int power(int dd,int p){
        int f=1;
        for(int i=1;i<=p;i++)
        {
            f*=dd;
        }
        return f;

    }
    

}
