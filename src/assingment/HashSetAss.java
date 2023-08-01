package assingment;
import java.util.*;
public class HashSetAss {

	public static void main(String[] args)
	{
     HashSet hs=new HashSet();
     
     hs.add("Green");
     hs.add("Purple");
     hs.add(null);
  
     
     System.out.println(hs);
     
     System.out.println("--------------------------");
     HashSet<Integer> hs1=new HashSet<Integer>();
     hs1.add(50);
     hs1.add(60);
     hs1.add(70);
     
   //  Write a Java program to append the specified element to the end of a hash set.
     
     hs.addAll(hs1);
     System.out.println(hs);
     System.out.println("--------------------");
     
     /*
Write a Java program to append the specified element to the end of a hash set.
Write a Java program to iterate through all elements in a hash list.
Write a Java program to get the number of elements in a hash set.
Write a Java program to empty an hash set.
Write a Java program to test if a hash set is empty or not.
Write a Java program to clone a hash set to another hash set.
Write a Java program to convert a hash set to an array.
Write a Java program to convert a hash set to a tree set.
Write a Java program to find numbers less than 7 in a tree set.
Write a Java program to compare two hash set.
Write a Java program to compare two sets and retain elements that are the same.
Write a Java program to remove all elements from a hash set.

*/
    
     //Write a Java program to iterate through all elements in a hash list.
     
     for(Object ob:hs)
     {
    	 System.out.println(ob);
     }

     
     System.out.println("--------------------");
     
     
     // get the number of elements in a hash set.
    
     
     System.out.println(hs.size());
     
     
     System.out.println("--------------------");
     
     
     
     
  //   Write a Java program to test if a hash set is empty or not.
     
 Object obj=    hs.isEmpty();
 System.out.println(obj);
     
 System.out.println("--------------------");
 
 
     //Write a Java program to empty an hash set.
   hs1.clear();
   System.out.println(hs1);
     
     
   System.out.println("--------------------");
   
   //Write a Java program to clone a hash set to another hash set.
   
   HashSet<String> hs2=new HashSet<String>();
   hs2.add("Shiv");
   hs2.add("Nikame");
   hs2.add("Komal");
   
   HashSet hs3=(HashSet)hs2.clone();
   System.out.println(hs3); 
   
   System.out.println("--------------------");
   
   //Write a Java program to convert a hash set to an array.
   
   String[] o=new String[hs2.size()];
  hs2.toArray(o);
  
  for(String s:o)
  {
	  System.out.println(s);
  }
  
  System.out.println("--------------------");
 
     
    // Write a Java program to convert a hash set to a tree set.
     
     TreeSet<String> ts=new TreeSet<String>(hs2);
     for(String s:ts)
     {
    	 System.out.println(s);
     }
     
     System.out.println("--------------------");
     
     //Write a Java program to compare two hash set.
     
   Object ok=  hs.equals(hs2);
   System.out.println(ok);
     
   System.out.println("--------------------");
   
   //Write a Java program to compare two sets and retain elements that are the same.
   
   hs.retainAll(hs1);//keep comom elements
   System.out.println(hs);
     
     
     //Write a Java program to remove all elements from a hash set.
   
   hs.removeAll(hs1);
   System.out.println(hs);
     
     
	}

}
