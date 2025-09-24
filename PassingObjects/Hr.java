package PassingObjects;

import java.util.Scanner;

public class Hr {

	static void displayEmployeeDetails(Employee e)
	{
		if(e!=null) {
			System.out.println("Eid :"+e.eid);
			System.out.println("CTC :"+ e.ctc);
			
		}
	}
	static Employee creatEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EID");
		int eid=sc.nextInt();
		System.out.println("Enter the Ctc");
		double ctc=sc.nextDouble();
		Employee e = new Employee(eid,ctc);
		return e;
	}
}
