package Arrays;

public class LogicalOperators extends comparisionoperator {
	/*
	 * add
	 * mul
	 */


	public void mul(int a, int b)
	{
		int c =a*b;
		System.out.println(c);
	}

	/*public void add(int a, int b)
	{
		int c =a+b;
		System.out.println(c);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicalOperators L = new LogicalOperators();
		L.mul(4, 5);
		L.add(5, 6);
	}

}
