package Swiggy;

public class SVBdetails extends Item{
	String[] Items = {"Idly-15","Dosa-140","Poori-505","CB-1250","MB-3150"};


	public String GetItemExistInHotel(String expectedItem)
	{
		return GetItem(expectedItem,this.Items);
	}

}
