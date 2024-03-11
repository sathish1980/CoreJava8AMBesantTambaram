package Collectionconcepts;

public class Stringexample {

	String name = "Besant technology tambaram";
	String filename = "sathish.xlsx";
	String age="33";
	Integer news=45;

	public void stringimple()
	{
		//String newAge = String.valueOf(age);
		int newAge = Integer.parseInt(age);
		int newAge1;
		int currentdate = 21;
		System.out.println(newAge+currentdate);
		int index = filename.indexOf('.');
		String name1 = name.replace(name.substring(11,15), name.substring(11,15).toUpperCase());
		System.out.println(name.replace("Besant", ""));
		System.out.println(name1);
		System.out.println(filename.substring(index+1).concat(" File"));
		System.out.println(name.substring(2,8));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringexample s = new Stringexample();
		s.stringimple();
	}

}
