package Upcasting;
class Delta
{
	int num=100;
	
}
class Example extends Delta
{
	int val=200;
}
public class MainClassss12 {
public static void main(String[] args) {
	Delta delta=new Example();
	System.out.println(delta.num);
//	System.out.println(delta.val);   ---> here we cannot acess the val as it asacess after upcasting 
}
}
