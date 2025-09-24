package MethodOverloading;
class facebook
{
	void Login(String un, String pwsd)
	{
		System.out.println(("logged using String"));
	}
	void Login(Long  num, String Pwsd)
	{
		System.out.println("Logged using Mobile number ");
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		facebook reFacebook=new facebook();
		reFacebook.Login("abc", "AC");
		reFacebook.Login(12L, "Say");
		
	}
	
}
