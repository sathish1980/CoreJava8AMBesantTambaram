package CoreJavaBasics;

public class Polymorphisam {

	public void Add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}

	public void Add(double a, int b)
	{
		double c= a+b;
		System.out.println(c);
	}

	public void Add(double a, double b)
	{
		double c= a+b;
		System.out.println(c);
	}


	public void Add(int a, int b,int c)
	{
		int d= a+b+c;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphisam P = new Polymorphisam();
		P.Add(2.1,3);
	}

}
