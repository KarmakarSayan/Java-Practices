package PassingObjects;

import java.util.Scanner;

public class TicketCounter {

	static void displayTicketDetails(RailwayTicket tk)
	{
		if(tk!=null) {
			System.out.println("PNR NO : "+tk.pnr);
			System.out.println("Ticket Price :"+tk.price);
		}
		
	}
	static RailwayTicket inputTicket()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ticket Pnr :");
		long pnr=sc.nextLong();
		System.out.println("Enter the Price Details :");
		double price=sc.nextDouble();
		RailwayTicket tt=new RailwayTicket(pnr,price);
		return tt;
		
}
}
