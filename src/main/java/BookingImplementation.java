
public class BookingImplementation implements Interfacetoday{

	public static  void login(String username, String password)
	{
		if(username.equals("sathish") && password.equalsIgnoreCase("test"))
		{
			System.out.println("You have sucessfully logged in");
		}
		else
		{
			System.out.println("u have eneterd incorrect username or password");
		}
	}

	@Override
	public void addPayment()
	{
		int paymentamount = 5000;
		System.out.println("your payment is rs . " + paymentamount);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacetoday b = new BookingImplementation();
		//BookingImplementation b1= new BookingImplementation();
		login("sathish", "test");
		b.addPayment();
	}

}
