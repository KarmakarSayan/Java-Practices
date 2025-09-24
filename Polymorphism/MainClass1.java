package Polymorphism;
class Flipkart{
	void payment()
	{
		System.out.println("COD");
	}
	void payment(long card) {
		System.out.println("Card Payment");
	}
	void payment(String Upi)
	{
		System.out.println("Upi payment");
		
	}
}
public class MainClass1 {
	public static void main(String[] args) {
		Flipkart reFlipkart=new Flipkart();
		reFlipkart.payment();
		reFlipkart.payment("Gpay");
		reFlipkart.payment(121113L);
	}
}
