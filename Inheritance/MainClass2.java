package Inheritance;
class Alpha 
{
	void Display()
	{
		System.out.println("Executing Display method");
	}
}
class beta extends Alpha
{
	void test()
	{
		System.out.println("Executing Test Method ");
	}
}
public class MainClass2 {
public static void main(String[] args) {
	beta refAlpha=new beta();
	refAlpha.Display();
	refAlpha.test();
}
}