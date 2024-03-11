package FileHandling;

public class Arrays {

	String[] name= {"sathish","raja","vicky","dinesh"};

	int[] age = new int[5]; // intialize an array

	public void Arraysimplementation()
	{
		System.out.println(name[2]);
		System.out.println(age[2]);
		age[4] =5;
		System.out.println(age[2]);

		for(int eachval : age)
		{
			System.out.println(eachval);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.Arraysimplementation();
	}

}
