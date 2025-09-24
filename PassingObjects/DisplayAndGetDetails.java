package PassingObjects;

import java.util.Scanner;

public class DisplayAndGetDetails {
static void dispDetails(Player p) {
	if(p!=null)
	{
		System.out.println("jersey No :"+p.j_no);
		System.out.println("Player Name :"+p.name);
	}
	
}
static Player createPlayer()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the jersey no");
	int j_no=scanner.nextInt();
	System.out.println("Enter the Name Of Player ");
	String name=scanner.next();
	Player p=new Player(j_no, name);
	return p;
}
}