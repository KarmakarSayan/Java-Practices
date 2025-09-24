package hasarelationship;

//import java.sql.Driver;

class Enginee
{
	void power()
	{
		System.out.println("Execcuting Power");
	}
}
class Driver
{
	void drive()
	{
		System.out.println("Executing Drive Class");
	}
}
class Car
{
	Enginee eng=new Enginee();
	Driver dr=new Driver();
	Car(Driver d){
		this.dr=dr;
	}
}
public class MainClass3 {
public static void main(String[] args) {
	Driver dr=new Driver();
	Car c=new Car(dr);
	c.eng.power();
	c.dr.drive();
}
}
