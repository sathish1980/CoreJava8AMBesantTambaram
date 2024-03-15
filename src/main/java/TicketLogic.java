
public class TicketLogic {

	int totalTickets =5;

	public synchronized void getTicket(String name,int totalTicketRequired)
	{

		if(totalTicketRequired>0 && totalTicketRequired<=totalTickets)
		{
			System.out.println( "Hi" +name +"you have booked " + totalTicketRequired + "tickets");
			totalTickets = totalTickets-totalTicketRequired;
		}
		else
		{
			System.out.println( "Hi" +name +"No available ticket ");
		}
	}

}
