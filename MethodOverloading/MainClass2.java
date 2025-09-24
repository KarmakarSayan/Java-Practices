package MethodOverloading;
class Sample
{
	void test(int a)
	{
		System.out.println("Red");
	}
	void test(int a, int b) 
	{
		System.out.println("Green");
	}
	void test(int a, int b, int c) {
		System.out.println("Black");
	}
}
public class MainClass2 {
public static void main(String[] args) {
	Sample refSample=new Sample();
	refSample.test(1);
	refSample.test(12,12);
	refSample.test(12,12,12);
}
}
