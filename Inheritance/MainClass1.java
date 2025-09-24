package Inheritance;
class demo
// super class 
//Base Class
{
	int val=100;
	void test()
	{
		System.out.println("Executing test Mehtod ");
	}
}
class sample  extends demo
//sub class
// Derived  class
// the sample class inherits the property of the demo class 
{
	int sampleValue=200;
	void sampleee()
	{
		System.out.println("Executing Sample Class ");
	}
}
public class MainClass1 {
public static void main(String[] args) {
	sample refSample=new sample();
	System.out.println(refSample.val);
	refSample.test();
	refSample.sampleee();
}
}
