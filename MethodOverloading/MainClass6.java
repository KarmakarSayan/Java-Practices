package MethodOverloading;
class fingerprint 
{
	
}
class Mobile 
{
	void pass()
	{
		System.out.println("swipe Unlock");
	}
	void pass(String s)
	{
		System.out.println("unlocked using pAsswrod ");
	}
	void pass(fingerprint F)
	{
		System.out.println("Fingerprint Lock");
	}
}
public class MainClass6 {
public static void main(String[] args) {
	Mobile refMobile=new Mobile();
	refMobile.pass();
	refMobile.pass("ABC");
	refMobile.pass(new fingerprint());// here creates the  fingerprint lock 
}
}
