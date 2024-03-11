import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueConcepts {
	public void queueImplementation()
	{
		//Queue<String> qs = new LinkedList();
		Queue<String> qs = new PriorityQueue(Collections.reverseOrder());
		System.out.println(qs);
		//CRUD
		qs.add("Sathish");
		qs.add("Remove");
		qs.add("Apple");
		qs.add("Zebra");
		qs.remove(); // FIFO
		System.out.println(qs);
		qs.isEmpty();
		qs.contains("remove");
	}


	public void agecalc(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Hi this is sathish");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueConcepts q = new QueueConcepts();
		q.queueImplementation();
		q.agecalc(16);
	}

}
