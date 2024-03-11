package SecondPackage;

import CoreJavaBasics.DataTypes;

public class Thirdclass extends DataTypes {

	//DataTypes d = new DataTypes();

	public int birthYear =1990;


	public void getAge()
	{
		add(3,5);
		int age = currentyear - birthYear;
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thirdclass t = new Thirdclass();
		t.getAge();
	}

}
