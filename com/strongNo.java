package com;

public class strongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145;
        int s=0;
        int d=0;
        int no=n;
        while(n>0)
        {
        d=n%10;
        s+=fact(d);
        n=n/10;
        }
        if(no==s)
            System.out.println("Strong no");
        else
            System.out.println("Not Strong");
    }
    static int fact(int dd)
    {
        int f=1;
        for(int i=1;i<=dd;i++)
        {
            f*=i;
        }
        return f;

    }
	}

