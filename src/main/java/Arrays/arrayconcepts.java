package Arrays;

public class arrayconcepts {

	int[] age = {30,45,25,20,15};
	int[] fees= new int[5];
	int[][] agegroup= {{1,2,6},
			{2,3,5}};

	public void getArray()
	{
		System.out.println(age.length);
		System.out.println(age[3]);
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println(fees);

		for(int eachvalue:fees)
		{
			System.out.println(eachvalue);
		}
		fees[3]=7;
		System.out.println(agegroup[1][2]);
		System.out.println(agegroup.length);
		System.out.println(agegroup[0].length);
		for(int j=0;j<agegroup.length;j++)
		{
			System.out.println(agegroup[j]);
			agegroup[0][2]=9;
			for(int k=0;k<agegroup[j].length;k++)
			{
				System.out.print(agegroup[j][k] +" ");
			}

			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayconcepts a = new arrayconcepts();
		a.getArray();
	}

}
