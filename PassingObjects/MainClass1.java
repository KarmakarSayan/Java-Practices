package PassingObjects;

public class MainClass1 {
public static void main(String[] args) {
	Employee e1=Hr.creatEmployee();
	Hr.displayEmployeeDetails(e1);
	System.out.println("------------------------------");
	Employee e2=Hr.creatEmployee();
	Hr.displayEmployeeDetails(e2);
	System.out.println("------------------------------");
	Employee e3=Hr.creatEmployee();
	Hr.displayEmployeeDetails(e3);

}
}
