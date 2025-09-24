package DownCasting;
class Demo
{
	
}
class Sample extends Demo{// Doing Inheritance 
	
}
public class MainClass1 {
public static void main(String[] args) {
	Demo refDemo=new Sample();// Converting first to UpCasting 
	Sample objSample=(Sample)refDemo;// Doing casting
	System.out.println(refDemo);
	System.out.println(objSample);
}
}
