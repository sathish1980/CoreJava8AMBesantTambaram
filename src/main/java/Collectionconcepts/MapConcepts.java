package Collectionconcepts;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapConcepts {

	/*
	 * Performing to get a Name from the customer
	 * Date:01-03-2024
	 * requirement :101
	 */
	public void MapImplementation()
	{
		//	Map<Integer,String> M = new HashMap<>();
		//Map<Integer,String> M = new LinkedHashMap<>();
		Map<Integer,String> M = new TreeMap<>();
		Map<Integer,String> M1= new HashMap<>();
		//add
		M.put(10, "Sathish");
		M.put(11, "R");
		M.put(13, "Btech");
		M.put(10, "kumar");
		M1.put(12, "Python");
		M1.put(15, "JAva");
		M1.put(14, "c#");
		System.out.println(M);
		M.putAll(M1);
		System.out.println(M);

		//update
		M.replace(13, ".Net");
		M.replace(20, "Python");
		//remove
		//M.remove(12);
		M.remove(12, "Btech");
		M.remove(20);

		System.out.println(M);

		// retreive

		//to get all keys
		System.out.println(M.keySet());

		//to get value
		System.out.println(M.values());

		//to get a keyvaluepair
		System.out.println(M.entrySet());

		// to get specific value based on key
		System.out.println(M.get(14));

		//
		for(Entry<Integer,String> MP :M.entrySet())
		{
			int value=MP.getKey();
			int a=2;
			double c=a;
			System.out.println(c);
			if(String.valueOf(value)=="14")
			{
				System.out.println(MP.getValue());
			}
			System.out.println(MP.getKey());
			System.out.println(MP.getValue());
		}

		System.out.println(M.containsKey(14));
		System.out.println(M.containsValue("sathish"));
		System.out.println(M.size());
		System.out.println(M.isEmpty());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapConcepts M = new MapConcepts();
		M.MapImplementation();
	}

}
