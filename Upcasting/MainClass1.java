package Upcasting;



public class MainClass1 {
public static void main(String[] args) {
	Mobile mobile=new Mobile();
	flipkart.addTocart(mobile);// auto upcasting form mobile  --> flipkart
	System.out.println(":Mobile" );
	
	
	television tel=new television();
	flipkart.addTocart(tel);// auto upcasting form television  --> flipkart 
	System.out.println(":televison " );
	// auto upcasting form mobile  --> flipkart// auto upcasting form mobile  --> flipkart// auto upcasting form mobile  --> flipkart// auto upcasting form mobile  --> flipkart// auto upcasting form mobile  --> flipkart// auto upcasting form mobile  --> flipkart// auto upcasting form mobile  --> flipkart
	Refrigerator ref=new Refrigerator();
	flipkart.addTocart(ref);// auto upcasting form refrigerator  --> flipkart
	System.out.println(":refrigerator" );
}
}
