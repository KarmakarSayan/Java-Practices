package hasarelationship;
class Department
{
	void teach()
	{
		System.out.println("Teaching");
	}
}
class Student
{
	void learn()
	
	{
		System.out.println("Learning Studet ");
	}
}
class College 
{
	Department d=new Department();
	Student s;
	College(Student s) {
	this.s=s;
	
}
}
public class MainClass5 {
public static void main(String[] args) {
	Student s=new Student();
	College coll=new College(s);
	coll.s.learn();
	coll.d.teach();
}
}
