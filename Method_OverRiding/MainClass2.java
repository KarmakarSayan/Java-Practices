package Method_OverRiding;
class father
{
	void motercycle() {
		System.out.println("Normal");
	}
}
class gunda   extends father
{
	@Override
	void motercycle()
	{
		System.out.println("Abnormal");
	}
}
public class MainClass2 {
	public static void main(String args[])
{
		
	father ref	=new father();
	ref.motercycle();
	
	
	gunda reffGunda=new gunda();
	reffGunda.motercycle();
	
	
	father reFather=new gunda();
	reFather.motercycle();
}
}
