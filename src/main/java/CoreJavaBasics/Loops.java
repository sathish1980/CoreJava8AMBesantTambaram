package CoreJavaBasics;

import java.io.IOException;

public class Loops {

	public void forloop(int startValue)
	{
		/*for(int i=3;i<=13;i++)
		{
			System.out.println(i);
		}*/

		/*for(int i=13;i>=3;i--)
		{
			System.out.println(i);
		}*/

		for(int i=startValue;i<=startValue+10;i++)
		{
			if(i==105 || i==109)
			{
				continue;
			}
			System.out.println(i);
		}
	}


	public void whileloop() throws IOException,NullPointerException
	{
		int i=10;
		while(i<10)
		{
			System.out.println(i);
			i=i+1;
		}
	}

	public void dowhileloop()
	{
		int i=10;
		do
		{
			System.out.println(i);
			i=i+1;
		}while(i<10);
	}

	public void div()
	{
		try
		{
			int a=20;

			int b=10;
			int c=a/b;
			System.out.println(c);

		}
		catch(ArithmeticException e)
		{
			System.out.println("This is airthmetic exception"+e);
			int c= 5*10;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
			int c= 5*5;
			System.out.println(c);
		}
		finally
		{
			System.out.println("This is finally");
		}

	}


	public void agevalidation(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are below 18");
		}
		else
		{
			System.out.println("Your age is: " +age);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		L.div();
		L.dowhileloop();
		L.agevalidation(16);
		try {
			L.whileloop();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
