package hasarelationship;
class camera
{
	void photo() {
		System.out.println("Clicking photo");
	}
}
class simcard{
	void services()
	{
		System.out.println("using Simcard");
		
	}
}
class mobile{
	camera c=new camera();
	simcard sim;
	mobile(simcard sim){
		this.sim=sim;
	}
}
public class MainClass4 {
public static void main(String[] args) {
	simcard s=new simcard();
	mobile m=new mobile(s);
	m.c.photo();
	m.sim.services();
}
}
