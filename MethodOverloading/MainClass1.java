package MethodOverloading;
class Demo
{
	void  Play(int a)
	{
		System.out.println("Ludo");
	}
	void Play(String s)
	{
		System.out.println("Cricket");
	}
	void Play(double d)
	{
		System.out.println("Batminton");
	}
}
public class MainClass1 {
public static void main(String[] args) {
	Demo refDemo=new Demo();
	refDemo.Play(1.2); //  Calls the Play Method with the doouble datatype 
	refDemo.Play(12);//  Calls the Play Method with the integer datatype
	refDemo.Play("Sayan");//  Calls the Play Method with the string datatype
}
}
