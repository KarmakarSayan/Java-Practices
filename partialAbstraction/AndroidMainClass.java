package partialAbstraction;

public class AndroidMainClass {
public static void main(String[] args) {
	Samsung samsung=new Samsung();
	AndroidServiceLayer.display(samsung);
	
	System.out.println("----------------");
	oppo oppo=new oppo();
	AndroidServiceLayer.display(oppo);
}
}