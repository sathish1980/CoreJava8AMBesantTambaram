package Collectionconcepts;

import java.util.List;
import java.util.Stack;

public class Stackclass {

	public void stackImplementation()
	{
		Stack<String> ls = new Stack();
		Stack<String> ls1 ;

		System.out.println(ls);
		ls.push("sathish");
		ls.push("kumar");
		ls.push("r");
		ls.push("sathish");
		System.out.println(ls);
		ls1=(Stack<String>) ls.clone();
		ls.pop();
		System.out.println(ls);
		System.out.println(ls1);
		List<String>ls2= ls1.reversed();
		System.out.println(ls2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackclass s = new Stackclass();
		s.stackImplementation();
	}

}
