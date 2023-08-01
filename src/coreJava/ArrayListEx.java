package coreJava;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) 
	{
		//to accept heterogenous values
		ArrayList al = new ArrayList();

		//Arraylist to add only String values
		ArrayList<String> al1= new ArrayList<String>();

		//Arraylist to add only integer values
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		// 4th way of creating ArrayList
		List al4 = new ArrayList();


		al.add("Java");
		al.add(1);
		al.add(14.5);
		al.add('c');
		al.add(true);
		al.add(null);
		al.add("Java");

		System.out.println(al);//[Java, 1, 14.5, c, true]


		System.out.println(al.size()); //5

		al.remove(2);
		System.out.println("After removing element from index 2-->"+al); //After removing element from index 2-->[Java, 1, c, true]


		al.add(2, "C++");
		System.out.println("After adding element at index 2-->"+al); //After adding element at index 2-->[Java, 1, C++, c, true]

		System.out.println(al.get(0));// Java

		al.set(1, "python");
		System.out.println("After replacing the value at index 1-->"+al); //After replacing the value at index 1-->[Java, python, C++, c, true]

		System.out.println(al.contains("C++")); //true
		System.out.println(al.contains("pascal")); //false

		System.out.println(al.isEmpty()); //false
		System.out.println(al1.isEmpty()); //true

		//First way to iterate over a collection

		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("=========================");

		//second way for iterating over a collection
		for(Object data:al)
		{
			System.out.println(data);
		}

		System.out.println("=========================");
		//Iterator
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}













	}

}
