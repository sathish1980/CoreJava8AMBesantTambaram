package abstraction;

public class InvoiceNew extends AbsFirstClass{


	String name ="Sathish";


	@Override
	public void sub()
	{
		int a =10;
		int b=70;
		int c=b-a;
		System.out.println(c);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("normal variable "+name);
		String newvar = name.toUpperCase();
		System.out.println("after change the normal variable "+name);
		System.out.println("New variable "+newvar);

		StringBuffer s = new StringBuffer(name);
		System.out.println(s);
		s.append("kumar");
		System.out.println(s);

	}

	public void Tax(int amount)
	{
		System.out.println("Your tax amount is : "+amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsFirstClass I = new InvoiceNew();
		InvoiceNew I1 = new InvoiceNew();
		I1.Tax(500);
		I.sub();
		I.mul();
	}



}
