package coreJava;
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) 
	{
		//Heterogenous data
		HashSet hs=new HashSet();

		//By memeory size
		HashSet hs1=new HashSet(200);


		//By fill ratio explicitly
		HashSet hs3=new HashSet(200,(float)0.80);

		//Homogeneous
		HashSet<Integer> hs4=new HashSet<Integer>();


		hs.add("Java");
		hs.add(true);
		hs.add(null);
		hs.add(60);
		hs.add("python");

		hs4.add(20);
		hs4.add(50);
		hs4.add(69);

		System.out.println("Hshset list  "+hs);

		System.out.println("Integer hashset list  "+hs4);

		hs.remove("Java");

		System.out.println("After removing values---"+hs);


		hs4.addAll(hs);

		System.out.println("After adding collection to hs to hs4 "+hs);

		hs4.removeAll(hs);

		System.out.println("After removing collection hs from hs4  "+hs);


		System.out.println(hs.isEmpty());

		System.out.println(hs.contains("python"));

		System.out.println(hs.contains("Rubi"));

		System.out.println(hs.containsAll(hs4));
		
		
		System.out.println("----------------------");
		
		
		for(Object ob:hs)
		{
			System.out.println(ob);
		}
		
		
		System.out.println("---------------------------------");
		
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}



	}

}
