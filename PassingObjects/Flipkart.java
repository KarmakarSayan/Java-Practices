package PassingObjects;

import java.lang.classfile.constantpool.DoubleEntry;
import java.util.Scanner;

public class Flipkart {
	static void showproductDetails(Product p) {
		System.out.println("Product Id : "+p.pid);
		System.out.println("Product price :"+p.price);
	}
	static Product createProduct()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the product Id :");
		int pid=scanner.nextInt();
		System.out.println("Enter the Product Price :");
		double price=scanner.nextDouble();
		Product pr=new Product(pid, price);
		return pr;
	}
}
