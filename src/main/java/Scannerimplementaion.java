import java.util.Scanner;

public class Scannerimplementaion {

	public void scannerdisplay()
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String Name =myObj.nextLine();
		System.out.println("Enter your Age : ");
		int Age =myObj.nextInt();
		System.out.println("My name is "+Name+" and my age is "+Age);
	}

	public int GetAgebySCanner()
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your Date of birth year : ");
		int Age =myObj.nextInt();
		return Age;
	}

	public void GetAge(int DOB)
	{
		int actualAge =2024- DOB;
		System.out.println("your age is "+actualAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scannerimplementaion s = new Scannerimplementaion();
		s.scannerdisplay();
		s.GetAge(s.GetAgebySCanner());
	}

}
