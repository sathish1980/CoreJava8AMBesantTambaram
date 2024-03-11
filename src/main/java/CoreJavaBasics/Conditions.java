package CoreJavaBasics;

public class Conditions {

	//if condition

	public void conditionsimplementation(String color,String vehicle,boolean Patiance)
	{
		if(color=="Red")
		{
			if(((vehicle=="ambulance" && (Patiance==true))))
			{
				System.out.println("Hey ! I am ambulance please give me a way");
			}
			else
			{
				System.out.println("you have to Stop");
			}

		}
		else if(color=="Orange")
		{
			System.out.println("you are ready to go/Stop");
		}
		else if(color=="Green")
		{
			System.out.println("you are good to Go");
		}
		else
		{
			System.out.println("This is not a valid color");
		}


	}

	public void Gender(String GenderChar)
	{
		switch(GenderChar)
		{
		case "M":
			System.out.println("You are Male");
			break;
		case "F":
			System.out.println("You are FeMale");
			break;
		case "T":
			System.out.println("You are Transgender");
			break;
		default:
			System.out.println("this is not a valid gender code");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions c = new Conditions();
		c.conditionsimplementation("Red","ambulance",true);
		c.Gender("A");
	}

}
