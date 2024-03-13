
public class ThreadClass extends Thread{


	@Override
	public void run()
	{
		Add();
	}
	public void Add()
	{
		int a=10;
		int b=20;
		int c= a+b;
		//System.out.println(c);

		for(int i=0;i<10;i++)
		{
			int number =6;
			System.out.println(number +"*" +i +"=" +number * i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass T = new ThreadClass();
		ThreadClass T1 = new ThreadClass();
		Thread t = new Thread(T); // first thread
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		System.out.println(t.isAlive());
		Thread t1 = new Thread(T1); // second thread
		System.out.println(t1.getState());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());

		t1.start();
		System.out.println(t1.getState());
		System.out.println(t.isAlive());
		//t1.yield();
		//T.run();
		//T.Add();
	}

}
