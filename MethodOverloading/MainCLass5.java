package MethodOverloading;
class irtct
{
	void search()
	{
		System.out.println("Searched using Train Number ");
	}
	void search(Long pnr)
	{
		System.out.println("Searched using pnr number");
	}
	void search(String name)
	{
		System.out.println("Searched using train name ");
	}
}
public class MainCLass5 {
public static void main(String[] args) {
	irtct refIrtct=new irtct();
	refIrtct.search();
	refIrtct.search(113L);
	refIrtct.search("Abc");
}
}
