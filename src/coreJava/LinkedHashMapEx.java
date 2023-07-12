package coreJava;
import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMapEx {

	public static void main(String[] args) 
	{
		LinkedHashMap lhm=new LinkedHashMap();

		LinkedHashMap<Integer,String> lhm1=new LinkedHashMap<Integer,String>();


		LinkedHashMap lhm2=new LinkedHashMap(100);

		LinkedHashMap lhm3=new LinkedHashMap(100,(float)0.9);


		lhm.put(101, "Vento");
		lhm.put(102,"Audi");
		lhm.put(103,"BMW");

		System.out.println(lhm);
		
		System.out.println(lhm.remove(102));
		
		System.out.println(lhm.containsKey(102));
		
		System.out.println(lhm.containsValue("Zen"));
		
		System.out.println(lhm1.isEmpty());
		
		System.out.println(lhm.size());
		
		System.out.println("KeySet------"+lhm.keySet());
		
		System.out.println("Values--------"+lhm.values());
		
		System.out.println("EntrySet---------"+lhm.entrySet());
		
		
       Set s=lhm.entrySet();
       
       Iterator it=s.iterator();
       while(it.hasNext())
       {
    	   Map.Entry value=  (Entry) it.next();
    	   
    	   System.out.println(value.getKey()+"--"+value.getValue());
       }
       
	}

}
