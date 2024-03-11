package Swiggy;

public class Hotel extends Item{

	String[] VegHotel = {"SVB","A2B","Sangeetha"};
	String[] NonVegHotel = {"Khalids","Buhari","Thalapakatti"};


	/*public boolean GetHotelExist(String expectedHotel)
	{
		for(String eachHotel : VegHotel) {
			if(eachHotel.equalsIgnoreCase(expectedHotel))
			{
				return true;
			}
		}
		//return false;

		for(String eachnonVegHotel : NonVegHotel) {
			if(eachnonVegHotel.equalsIgnoreCase(expectedHotel))
			{
				return true;
			}
		}
		return false;
	}*/

	public boolean GetHotelExist(String expectedHotel)
	{
		if(GetStringExistInArray(expectedHotel,VegHotel)==true)
		{
			return true;
		}
		else if(GetStringExistInArray(expectedHotel,NonVegHotel))
		{
			return true;
		}
		return false;
	}


}
