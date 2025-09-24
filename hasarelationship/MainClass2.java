package hasarelationship;
class Alpha
{
	void display()
	{
		System.out.println("Display mehtod executed ");
	}
}
class Beta
{
	Alpha a;
	Beta(Alpha a)
	{
		this.a=a;
	}
}
public class MainClass2 {
public static void main(String[] args) {
	Alpha a=new Alpha();
	Beta b=new Beta(a);
	b.a.display();
}
}
