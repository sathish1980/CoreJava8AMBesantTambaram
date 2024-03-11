package CoreJavaBasics;

public class Firstclasses {

	// syntax : accessmodifier returntype methodname(arguments/Parameters){}
	//Methods Types - 4types
	//********************/
	// 1 Method with out parameter /Arguments
	// 2 Method with Parameter /Arguments
	//***********************************/
	// 3 Method with out Return Type
	// 4 Method with Return type

	// Constructor
	// It is same as method
	// Constructor Name should be same as your class name
	// Constructor should not have any return type
	// Constructor is divided 2 type
	// 1 Constructor with out parameter /Arguments
	// 2 Constructor with Parameter /Arguments
	// constructor will be automatically called when u instantiate the class

	// parameterized constructor
	public Firstclasses(int a, int b)
	{
		int c= a+b;
		System.out.println("This is constructor" +c);
	}

	public Firstclasses()
	{
		//int c= a+b;
		System.out.println("This is constructor");
	}

	// 1. Method with out parameter and with out return type
	public void MyName()
	{
		String Name = "sathish";
		System.out.println(Name);
	}

	// 2. Method with parameter and with out return type
	public void MyNameWithParam(String Name, int age)
	{
		System.out.println(Name);
		System.out.println("My age is :"+age);
	}


	public int multiply(int a, int b)
	{
		int c =a*b;
		return c;
	}


	public void div(int a, int b, int denominator)
	{
		// int numerator = a*b;
		int numerator = multiply(a,b); // method return
		int d = numerator/denominator;
		System.out.println(d);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("sathish kumar R"+2+4);
		System.out.println("Besant");
		System.out.println("Tambaram");
		Firstclasses Fc = new Firstclasses(); // instantiation
		//Firstclasses.MyName();
		// Method call
		Fc.MyNameWithParam("Raja",45);
		Fc.div(5, 6, 10);
		// Fc.Firstclasses();
		Fc.MyName();
	}


}
