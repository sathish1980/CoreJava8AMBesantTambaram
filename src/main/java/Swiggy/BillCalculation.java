package Swiggy;

public class BillCalculation {

	double taxpercentage = 0.05;
	public int GetTotalAmount(int itemAmount,int quantity)
	{
		if(quantity>0)
		{
			return itemAmount*quantity;
		}
		return 0;
	}

	public double GetTax(double amount)
	{
		double taxAmount =amount*taxpercentage;
		return taxAmount+amount;
	}

	public double GetDiscount(int amount)
	{
		if(amount>500)
		{
			double discAmount = amount*0.05;
			return amount - discAmount;
		}
		else
		{
			return amount;
		}
	}

}
