package assingment;

import java.util.*;
import java.util.Map.Entry;
import java.util.Map.Entry;

public class CollectionAssingment {

	public static void main(String[] args) 
	{
//Given an array in Java, convert it to a collection.

		String arr[]= {"Dog", "cat", "tiger"};
		
		ArrayList al= new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
		
		Iterator itr= al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//2. Write a program to shuffle all the elements of a collection in Java.
	ArrayList as=new ArrayList();
	as.add("Home");
	as.add("Bunglow");
	as.add("Flat");
	
	System.out.println(as);
	
	Collections.shuffle(as);
	
	//Write a program in java to get the collection view of the values present in a HashMap.
	
	HashMap hs=new HashMap();
	hs.put(101,"Black");
	hs.put(102,"Brown");
	
	Set s=hs.entrySet();
	Iterator it= s.iterator();
	while(it.hasNext())
	{
		Map.Entry m=(Entry) it.next();
		System.out.println(m.getKey()+"-----------"+m.getValue());
		
	}
	
	//. Write a program in java to join two arraylists into one arraylist.
	
	
	ArrayList as2=new ArrayList();
	as2.add(101);
	as2.add(102);
	
	as.addAll(as2);
	System.out.println(as);
	
}
}