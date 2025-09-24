package Method_OverRiding;
class facebook
{
	void reaction()
	{
		System.out.println("Like");
	}
}
class facebooknew extends facebook
{
	@Override
	void reaction()
	{
		System.out.println("Haha, Wow");
	}
	
}
public class MainClass3 {
public static void main(String[] args) {
	facebook reFacebook=new facebook();
	reFacebook.reaction();
	
	facebooknew reFacebooknew=new facebooknew();
	reFacebooknew.reaction();
	
	
	facebook reffffFacebook=new facebooknew();
	reffffFacebook.reaction();
}
}
