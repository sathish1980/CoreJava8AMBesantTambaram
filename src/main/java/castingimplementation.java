
public class castingimplementation {

	double price =25.90;
	int age1=45;
	Integer age =20;
	String price1="45";

	String name ="s";

	public void Getautocast()
	{
		System.out.println(price);
		System.out.println((double)age);
		System.out.println((int)(price));
		System.out.println(Integer.parseInt(price1));
		Integer newage = Integer.valueOf(age1);
		int newage2 =age.intValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		castingimplementation c = new castingimplementation();
		c.Getautocast();
	}

}
