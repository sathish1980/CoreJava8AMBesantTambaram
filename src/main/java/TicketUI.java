
public class TicketUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketLogic TL = new TicketLogic();
		TicketThread TT = new TicketThread(TL,"sathish",2);
		TT.start();
		TicketThread TT1 = new TicketThread(TL,"kumar",3);
		TT1.start();
		TicketThread TT2 = new TicketThread(TL,"khan",5);
		TT2.start();
	}

}
