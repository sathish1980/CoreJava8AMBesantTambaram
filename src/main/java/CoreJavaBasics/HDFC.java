package CoreJavaBasics;

public class HDFC extends RBI{

	final double hdfciRate =0.15;

	//overriding

	public void interestRate()
	{
		System.out.println(hdfciRate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h = new HDFC();
		h.interestRate();

	}

}
