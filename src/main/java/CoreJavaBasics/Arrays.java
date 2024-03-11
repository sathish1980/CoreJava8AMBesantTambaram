package CoreJavaBasics;

public class Arrays {

	int[] price = {20,30,40,50};
	int[][] pricetoday = {{20,10,30}};

	public void GetArray()
	{
		System.out.println(price.length);
		System.out.println(price[3]);

		for(int i=0;i<price.length;i++)
		{
			System.out.println(price[i]);
		}

		for(int ac :price)
		{
			System.out.println(ac);
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.GetArray();
	}

}
