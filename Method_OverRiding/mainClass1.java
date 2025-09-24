package Method_OverRiding;
class parent
{
	void watchTv() {
		System.out.println("Serial");
		}
}
class child extends parent
{
	void watchTv() {
		System.out.println("Cartoon");
		}
}
public class mainClass1 {
public mainClass1() {
	// TODO Auto-generated constructor stub
	parent parent=new parent();
	parent.watchTv();
	
	child child=new child();
	child.watchTv();
}
}
