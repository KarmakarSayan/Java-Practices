package MethodOverloading;
class amazon
{
	void payment()
	{
		System.out.println("Cash On Delivery");
	}
	void payment(int a)
	{
		System.out.println("Google Pay");
	}
	void payment(String u)
	{
		System.out.println("UPI Payment");
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		amazon refAmazon=new amazon();
		refAmazon.payment();
		refAmazon.payment(12);
		refAmazon.payment("abc");
		}
	}

