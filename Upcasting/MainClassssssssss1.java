package Upcasting;
class Alpha
{
	void Play()
	{
		System.out.println("Executing Play");
	}
}
class Beta extends Alpha{
	void Disp()
	{
		System.out.println("Executing Disp");
	}
}
public class MainClassssssssss1 {
public static void main(String[] args) {
	Beta ref=new  Beta();
	Alpha a=ref;
	ref.Play();
	a.Play();
	
	// Subclass cannot Access super class -----> a.Disp() whre the a is the refreence of the super calss 
	// it cannnot acess thrr sub class ufuntions
//	 after upcasting w cannot ccess
	ref.Disp();
	
	
}
}
