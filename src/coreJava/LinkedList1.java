package coreJava;
import java.util.*;
public class LinkedList1
{

	public static void main(String[] args) 
	{
    LinkedList l=new LinkedList();
    l.add("Red");
    l.add("Blue");
    l.add("True");
    l.add(null);
    
    System.out.println("LinkedList List--->"+l);
    System.out.println("LinkedList size---"+l.size());
    
    
    l.add(4, "Red");
    System.out.println("After adding =="+l);
    
  System.out.println("Get the value at index 3----"+l.get(3));
    
   System.out.println("Set the value at index 0----"+ l.set(0, "False"));
    
    l.contains("Red");
    
    l.contains("Purple");
    
    for(int i=0;i<l.size();i++)
    {
    	System.out.println(l.get(i));
    }
    
    for(Object ll:l)
    {
    	System.out.println(ll);
    }
    Iterator it = l.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
}

}
