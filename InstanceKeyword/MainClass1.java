package InstanceKeyword;

class parent
{
	
}
class son extends parent{
	
}
class daughter extends parent
{
	
}
public class MainClass1 {
public static void main(String[] args) {
	parent p1=new son();
	if(p1 instanceof son)
	{
		System.out.println("Referene veriable is of SON");
	}
	else if(p1 instanceof daughter) {
		System.out.println("Referene veriable is of Daughter");
	}
	else {
		System.out.println("No Child ");
	}
}
}
