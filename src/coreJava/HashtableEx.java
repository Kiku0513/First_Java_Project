package coreJava;
import java.util.*;
import java.util.Map.Entry;
public class HashtableEx {

	public static void main(String[] args) 
	{
		Hashtable ht=new Hashtable();

		Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();

		Hashtable ht2=new Hashtable(100);

		Hashtable ht3=new Hashtable(150,(float)0.8);

		ht.put(101,"Blue");
		ht.put(102, "Brown");
		ht.put(103,"Black");

		System.out.println(ht);

		System.out.println( ht.containsKey(105));

		System.out.println(ht1.isEmpty());

		// System.out.println(ht.remove(102));

		System.out.println(ht.size());

		System.out.println(ht.get(101));

		System.out.println(ht.values());

		System.out.println(ht.entrySet());

		System.out.println(ht.keySet());

		/*for(Map.Entry eachEntry:ht.entrySet())
		{
			System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
		}
		*/
		Set v=   ht.entrySet();
		Iterator it=v.iterator();
		while(it.hasNext())
		{
			Map.Entry entry= (Entry) it.next();
			System.out.println(entry.getKey()+"----------"+entry.getValue()); 
		}
	}

}
