package hasarelationship;

class demo
{
	void test()
	{
		System.out.println("Executing demo");
	}
}
class Sample
{
	demo d=new demo();
}
public class MainClass1 {
public static void main(String[] args) {
	Sample s=new Sample();
	s.d.test();
}
}
