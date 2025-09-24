package Upcasting;
class Demo{
	
}
class Sample extends Demo{
	
}
public class pgr1 {
public static void main(String[] args) {
	 Sample ref=new Sample();
	 Demo  objDemo=ref;// upcasting 
	 System.out.println(ref);
	 
	 System.out.println(objDemo);
	 
}
}
