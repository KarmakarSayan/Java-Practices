package partialAbstraction;
abstract class demo{
	abstract void test();
	abstract void disp();
}
class sample extends demo{
	@Override
	void test()
		{
		System.out.println("excecuting test()....");
		}
@Override
void disp()
{
	System.out.println("excecuting test()....");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		demo demo=new sample();
		demo.test();
		demo.disp();
	}


}
