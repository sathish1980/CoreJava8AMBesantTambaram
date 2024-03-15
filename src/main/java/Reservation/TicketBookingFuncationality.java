package Reservation;

public class TicketBookingFuncationality {

	private int Availableticket =2;
	public synchronized void GenerateTicket(String user,int totalTicketRequested)
	{
		if(totalTicketRequested>0 &&totalTicketRequested<=Availableticket)
		{
			System.out.println("Hi " + user +" the requested "+totalTicketRequested+" tickets are booked sucessfully");
			Availableticket = Availableticket-totalTicketRequested;
		}
		else
		{
			System.out.println("Sorry No available tickets !!!");
		}
	}
}
