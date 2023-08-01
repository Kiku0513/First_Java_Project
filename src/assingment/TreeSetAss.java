package assingment;
import java.util.*;
public class TreeSetAss {

	public static void main(String[] args) 
	{
		/*Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
		2. Write a Java program to iterate through all elements in a tree set.
		3. Write a Java program to add all the elements of a specified tree set to another tree set.
		4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
		5. Write a Java program to get the first and last elements in a tree set.
		6. Write a Java program to clone a tree set list to another tree set.
		7. Write a Java program to get the number of elements in a tree set.
		8. Write a Java program to compare two tree sets.
		9. Write a Java program to find numbers less than 7 in a tree set.
		10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
		11. Write a Java program to get the element in a tree set less than or equal to the given element.
		12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
		13. Write a Java program to get an element in a tree set that has a lower value than the given element.
		14. Write a Java program to retrieve and remove the first element of a tree set.
		15. Write a Java program to retrieve and remove the last element of a tree set.
		16. Write a Java program to remove a given element from a tree set.*/
		
		
		TreeSet ts=new TreeSet();
		
		ts.add("Grren");
		ts.add("Blue");
		ts.add("White");
		ts.add("Orange");
				
		//Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
		System.out.println("TreeSet------>"+ts);
		
		//2. Write a Java program to iterate through all elements in a tree set.
		
		for(Object obj:ts)
		{
			System.out.println("Iterator --->"+obj);
		}
	
		//3. Write a Java program to add all the elements of a specified tree set to another tree set.
		
		TreeSet<String> tss=new TreeSet<String>();
		tss.add("Audi");
		tss.add("BMW");
		tss.add("Vento");
		ts.addAll(tss);
		System.out.println(ts);
		
		//Write a Java program to create a reverse order view of the elements contained in a given tree set.
		
	Iterator it=ts.descendingIterator();
	while(it.hasNext())
	{
		System.out.println("Desc"+it.next());
	}

	System.out.println("------------------");
	//. Write a Java program to get the first and last elements in a tree set
	System.out.println(ts.first());
	System.out.println(ts.last());
	
// Write a Java program to clone a tree set list to another tree set;
	TreeSet ts2=(TreeSet)ts.clone();
	System.out.println(ts2);
	
	//. Write a Java program to get the number of elements in a tree set.
	System.out.println(ts.size());
	
	//Write a Java program to compare two tree sets.
	Object obj=ts.equals(tss);
	System.out.println(obj);
	}

}
