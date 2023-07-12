package coreJava;
import java.util.*;
import java.util.Map.Entry;
public class HashMapEx {

	public static void main(String[] args) 
	{
		//heterogenous data
		HashMap hm = new HashMap();

		//Homogenous data
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		//Creating a hashmap with capacity
		//HashMap hm2 = new HashMap(100);

		//creating a hashmap with capacity and fill ratio
		//HashMap hm3 = new HashMap(100, (float).90);

		hm1.put(101, "John");
		hm1.put(102, "David");
		hm1.put(103, "Smith");
		hm1.put(null, "Jordan");
		hm1.put(104, null);
		hm1.put(102, "X");

		System.out.println(hm1);

		hm1.remove(102);
		System.out.println("After removing-->"+hm1);

		System.out.println(hm1.get(101));

		System.out.println(hm1.containsKey(101)); //true
		System.out.println(hm1.containsKey(106)); //false

		System.out.println(hm1.containsValue("John")); //true
		System.out.println(hm1.containsValue("Johnnn")); //false

		System.out.println(hm1.isEmpty()); //false
		System.out.println(hm.isEmpty()); //true

		System.out.println(hm1.size());

		System.out.println(hm1.keySet());

		System.out.println(hm1.values());

		System.out.println(hm1.entrySet());

		//for(datatype variablename:collection)

		for(Map.Entry eachEntry:hm1.entrySet())
		{
			System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
		}


			Set s= hm1.entrySet();

		Iterator itr= s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry= (Entry) itr.next();
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		}


		 

	}

}
