package Swiggy;

public class Item extends BillCalculation{

	String[] Items = {"Idly-5","Dosa-40","Poori-55","CB-250","MB-350"};
	String notExist ="The Given Item is not Exist";

	public String GetItem(String expectedItem ,String[] Items)
	{
		for(String eachItem : Items)
		{
			String[] eachItems =eachItem.split("-"); // Dosa 40
			if(eachItems[0].equalsIgnoreCase(expectedItem))
			{
				System.out.println("You have selected the item as : "+eachItems[0]);
				return eachItems[1];
			}

		}
		return notExist;
	}

	public String GetItemExistWithPrice(String expectedItem)
	{
		if(expectedItem!= null)
		{
			System.out.println("You have selected the item");
			return expectedItem;
		}
		return notExist;
	}



	public boolean GetStringExistInArray(String expectedvalue,String[] ArrayOfValues)
	{
		for(String eachValue : ArrayOfValues) {
			if(eachValue.equalsIgnoreCase(expectedvalue))
			{
				return true;
			}
		}
		return false;
	}

}
