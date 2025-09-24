package InstanceKeyword;

public class MainClass2 {
public static void main(String[] args) {
	Developer dev=new Developer();
	Manager.workReview(dev);
	
	System.out.println("--------------------");
	
	Tester test=new Tester();
	Manager.workReview(test);
}
}
