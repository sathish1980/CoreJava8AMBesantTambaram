
public class TicketThread extends Thread{

	public TicketLogic TL;
	private String name;
	private int totalTickets;

	public TicketThread(TicketLogic TL,String name,int totalTickets)
	{
		this.TL=TL;
		this.name=name;
		this.totalTickets=totalTickets;
	}

	@Override
	public void run()
	{
		TL.getTicket(name, totalTickets);
	}

}
