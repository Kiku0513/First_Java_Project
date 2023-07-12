package coreJava;
import java.util.*;
import java.util.Map.Entry;
public class TreeMapEx {

	public static void main(String[] args)
	{
TreeMap tm=new TreeMap();

TreeMap<Integer,String> tm1=new TreeMap<Integer,String >();

tm1.put(101,"Rose");
tm1.put(102, "Jasmine");
tm1.put(103,"Hibiscus");

System.out.println(tm1);

System.out.println(tm1.remove(101));

System.out.println(tm.isEmpty());

System.out.println(tm1.containsKey(101));

System.out.println(tm1.containsValue("Rose"));

System.out.println(tm1.size());

System.out.println(tm1.values());

System.out.println(tm1.entrySet());

System.out.println(tm1.keySet());

Set s=tm1.entrySet();
Iterator it=s.iterator();
while(it.hasNext())
{
	Map.Entry entry=(Entry) it.next();
	System.out.println(entry.getKey()+" ---"+entry.getValue());
	
	
}

	}

}
