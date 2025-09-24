package PassingObjects;

import java.util.Scanner;

public class HelperPen {
 
	static void displayPenDetails(Pen p)
	{
		if(p!=null) {
			System.out.println("Price:"+p.price);
			System.out.println("Colour :"+p.color);
			
		}
	}
	static Pen  createPen()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the price of the pen :");
		double price=scanner.nextDouble();
		System.out.println("Enter the Color of the pen :");
		String color=scanner.next();
		Pen p=new Pen(price, color)	;
		return p;
	}
}
