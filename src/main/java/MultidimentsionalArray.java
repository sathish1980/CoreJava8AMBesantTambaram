
public class MultidimentsionalArray {

	int[] table1= {3,4,5,6};
	int[] table2 = {7,8,9,10};
	int[] output;
	int[][] output1;
	/*
	 * [21,32,45,60]
	 *
	 * [21,24,27,30
	 * 	28,32,36,40
	 * 	35,40,45,50
	 * 	42,48,54,60]
	 *
	 * [3,4,5,6
	 * 	7,8,9,10]
	 */

	public void multiply()
	{
		output =new int[table1.length];
		for(int i=0;i<table1.length;i++)
		{
			int a =table1[i];
			//System.out.println(table1[i]);

			/*for(int j=0;j<table2.length;j++)
			{
			 */
			int b =table2[i];
			//System.out.println(table2[i]);
			output[i]=a*b;

			//}
		}
		System.out.println(output);
		for(int value:output)
		{
			System.out.println(value);
		}



	}

	public void mutimultiply()
	{
		output1 =new int[table1.length][table1.length];
		for(int i=0;i<table1.length;i++)
		{
			int a =table1[i];
			//System.out.println(table1[i]);

			for(int j=0;j<table2.length;j++)
			{

				int b =table2[j];
				System.out.println(a +" * " + b);
				output1[i][j]=a*b;

			}
		}
		System.out.println(output1);
		for(int[] value:output1)
		{
			for(int eachValues : value)
			{
				System.out.print (eachValues);
				System.out.print (" ");
			}
			System.out.println ("");
		}


	}


	public void multidi()
	{
		output1 = new int[2][table1.length];
		for(int i=0;i<table1.length;i++)
		{
			output1[0][i]=table1[i];
		}

		for(int j=0;j<table2.length;j++)
		{
			output1[1][j]=table2[j];
		}

		System.out.println(output1);
		for(int[] value:output1)
		{
			for(int eachValues : value)
			{
				System.out.print (eachValues);
				System.out.print (" ");
			}
			System.out.println ("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultidimentsionalArray M = new MultidimentsionalArray();
		M.multidi();
	}

}
