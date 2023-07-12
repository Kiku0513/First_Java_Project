package assingment;
import java.util.*;
public class LinkedListAss {

	public static void main(String[] args) 
	{
		LinkedList lin=new LinkedList();
		lin.add("Java");
		lin.add("Python");
		lin.add("Rubi");

		//1. Write a Java program to append the specified element to the end of a linked list.

		lin.addLast("C++");
		System.out.println("LinkedList---------->"+lin);


		System.out.println("-------------------------------------");

		//Write a Java program to iterate through all elements in a linked list.

		for(Object on:lin)
		{
			System.out.println(on);
		}
		System.out.println("-------------------------------------");

		//Write a Java program to iterate through all elements in a linked list starting at the specified position.

		for(int i=0;i<lin.size();i++)
		{
			System.out.println(lin.get(i));
		}

		System.out.println("-------------------------------------");

		//4. Write a Java program to iterate a linked list in reverse order.

		Collections.sort(lin,Collections.reverseOrder());
		System.out.println("Reversed order--------->"+lin);


		System.out.println("-------------------------------------");


		//5. Write a Java program to insert the specified element at the specified position in the linked list.

		lin.add(0, "c#");
		System.out.println("insert the specified element at the specified position in the linked list--------->"+lin);


		System.out.println("-------------------------------------");

		// Write a Java program to insert elements into the linked list at the first and last positions.

		lin.addFirst("True");
		lin.addLast("False");
		System.out.println("After Addind At First n Last ------>"+lin);


		System.out.println("-------------------------------------");

		//. Write a Java program to insert the specified element at the front of a linked list.

		lin.add(0, null);
		System.out.println("insert the specified element at the front of a linked list----->"+lin);

		System.out.println("-------------------------------------");

		// Write a Java program to insert the specified element at the end of a linked list.

		lin.addLast(50);
		System.out.println("insert the specified element at the end of ------->"+lin);

		System.out.println("-------------------------------------");

		//Write a Java program to insert some elements at the specified position into a linked list.

		LinkedList<String> ls=new LinkedList<String>();
		ls.add("Electrical");
		ls.add("Compurter");

		lin.addAll(2,ls);
		System.out.println("insert some elements at the specified position--------->"+lin);


		System.out.println("-------------------------------------");

		//Java program to get the first and last occurrence of the specified elements in a linked list.


		Object ob1=	lin.getFirst();
		System.out.println("fIRST oCCURnace------>"+ob1);


		Object ob2=lin.getLast();
		System.out.println("Get Last=--->"+ob2);

		System.out.println("-------------------------------------");

		//display elements and their positions in a linked list.

		for(int i=0;i<lin.size();i++)
		{
			System.out.println(lin.get(i));
		}

		System.out.println("-------------------------------------");

		// remove a specified element from a linked list.

		lin.remove(0);
		System.out.println("Remove at 0----->"+lin);

		System.out.println("-------------------------------------");

		//remove the first and last elements from a linked list.

		lin.removeFirst();
		System.out.println("Remove First--------->"+lin);

		lin.removeLast();
		System.out.println("Remove Last---------->"+lin);

		System.out.println("-------------------------------------");


		//remove all elements from a linked list.

		lin.removeAll(ls);
		System.out.println("remove all elements from a linked list----------->"+lin);


		System.out.println("-------------------------------------");

		// Write a Java program that swaps two elements in a linked list.

		Collections.swap(lin, 0, 1);
		System.out.println("swaps two elements-------->"+lin);

		System.out.println("-------------------------------------");

		//Write a Java program to shuffle elements in a linked list.

		Collections.shuffle(lin);
		System.out.println("shuffle elements ----->"+lin);

		System.out.println("-------------------------------------");

		// Write a Java program to join two linked lists.

		lin.addAll(ls);
		System.out.println("join two linked lists------>"+lin);


		System.out.println("-------------------------------------");

		// Write a Java program to copy a linked list to another linked list.
		LinkedList<String> ars= new LinkedList<String> ();
		ars.add("Komal");
		ars.add("Ashish");

		LinkedList ar=(LinkedList)ars.clone();
		System.out.println("to copy a linked list to another linked list------->"+ar);

		System.out.println("-------------------------------------");

		//Write a Java program to remove and return the first element of a linked list.

		ars.pop();
		System.out.println(ars);

		System.out.println("-------------------------------------");

		// Write a Java program to retrieve, but not remove, the first element of a linked list.


		Object f=lin.peekFirst();
		System.out.println(f);

		System.out.println("-------------------------------------");

		//21. Write a Java program to retrieve, but not remove, the last element of a linked list.

		Object l=	lin.peekLast();
		System.out.println(l);

		System.out.println("-------------------------------------");

		//22. Write a Java program to check if a particular element exists in a linked list.
		Object li=	lin.contains("Java");
		System.out.println(li);

		System.out.println("-------------------------------------");

		// Write a Java program to convert a linked list to an array list.
		ArrayList as=new ArrayList(lin);
		System.out.println(as);

		for(Object ar2:as)
		{
			System.out.println(ar2);
		}

		System.out.println("-------------------------------------");

		//24. Write a Java program to compare two linked lists and print the linked list

		Object bj=	lin.equals(ars);
		System.out.println(bj);
		
		System.out.println("-------------------------------------");
	
	// Write a Java program to check if a linked list is empty or not.
	
		System.out.println(ars.isEmpty());
		
		System.out.println("-------------------------------------");
		
		//26. Write a Java program to replace an element in a linked list.
		
System.out.println( lin.set(0, "kiki"));
		
	}

}
