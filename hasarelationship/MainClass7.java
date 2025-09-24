package hasarelationship;
class Printer
{
	void print(int a)
	{
		System.out.println("Executing a :"+a);
	}
	void print(String s) {
		System.out.println("Executing  String :"+s);
	}
}
class Computer{
	static Printer out=new Printer();
}
public class MainClass7 {
public static void main(String[] args) {
	Computer.out.print(1);
	Computer.out.print("Abc");
}
}
