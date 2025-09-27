package partialAbstraction;
abstract class Demo{
	void run()
	{
		System.out.println("Executing run()----");
	}
	void play()
	{
		System.out.println("Executing play()----");
	}
}
class samplee extends Demo{
	
}

public class MainClass2 {
public static void main(String[] args) {
	Demo demo=new samplee();
	demo.run();
	demo.run();
}
}
