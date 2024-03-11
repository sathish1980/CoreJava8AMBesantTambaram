package CoreJavaBasics;

public class DataTypes {

	public int currentyear=2024; // global
	static int b =15; //static
	public void add(int a, int b) //local
	{
		int c=a+b; //local
	}

	protected void sub()
	{
		System.out.println(currentyear);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypes d = new DataTypes();
		d.sub();
	}

}
