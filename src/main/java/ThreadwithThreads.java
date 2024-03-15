
public class ThreadwithThreads implements Runnable {


	@Override
	public void run()
	{
		print();
	}
	public synchronized void print()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadwithThreads T = new ThreadwithThreads();
		Thread TT = new Thread(T);
		TT.start();
		TT.setName("First Set");
		System.out.println(TT.getName());
		ThreadwithThreads T1 = new ThreadwithThreads();
		Thread TT2 = new Thread(T1);
		TT2.start();
		TT2.setName("Second Set");
		System.out.println(TT2.getName());
	}

}
