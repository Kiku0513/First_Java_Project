package assingment;
import java.util.*;
public class ArrayListProgram {

	public static void main(String[] args)
	{
		//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
		ArrayList al=new ArrayList();
		al.add("Red");
		al.add("Blue");
		al.add("Yellow");
		al.add("Green");

		System.out.println("Arraylist is ----->"+al);

		System.out.println("-------------------------------------");



		//2. Write a Java program to iterate through all elements in an array list.

		for(Object o:al)
		{
			System.out.println(o);

		}
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println("Iterator ------>"+it.next());
		}

		System.out.println("-------------------------------------");

		//3. Write a Java program to insert an element into the array list at the first position.

		al.add(0, "Pink");
		System.out.println("After Inserting at 0 index --->"+al);

		System.out.println("-------------------------------------");


		//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("-------------------------------------");


		//5. Write a Java program to update an array element by the given element.	

		al.set(1, "purple");
		System.out.println("After Update---->"+al);


		System.out.println("-------------------------------------");

		//6. Write a Java program to remove the third element from an array list.

		al.remove(2);

		System.out.println("Remove at index 2---->"+al);

		System.out.println("-------------------------------------");	


		//7. Write a Java program to search for an element in an array list.

		Object res=	al.contains("Wine");
		System.out.println("Search Element------>"+res);

		System.out.println("-------------------------------------");	


		// Write a Java program to sort a given array list.	

		Collections.sort(al);
		System.out.println("After Sorting ---->"+al);


		System.out.println("-------------------------------------");

		// Write a Java program to copy one array list into another.	


		ArrayList<Integer> ai=new ArrayList<Integer>();
		ai.add(20);
		ai.add(40);
		ai.add(80);
		ai.addAll(al);
		System.out.println("After adding al to ai----->"+ai);



		System.out.println("-------------------------------------");

		//Write a Java program to shuffle elements in an array list.

		Collections.shuffle(ai);
		System.out.println("Shuffle all the Element--->"+ai);



		System.out.println("-------------------------------------");


		// Write a Java program to reverse elements in an array list.

		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Reversed Order--->"+al);

		System.out.println("-------------------------------------");


		//12. Write a Java program to extract a portion of an array list.	

		ai.retainAll(al);
		System.out.println("Extract al from ai ------>"+ai);


		System.out.println("-------------------------------------");

		//	Write a Java program to compare two array lists.	
		ArrayList<String> as=new ArrayList<String>();

		as.add("Blue");
		as.add("NavYbLue");
		as.add("white");
		//System.out.println(as);

		Object res2=	as.containsAll(al);
		System.out.println(res2);


		System.out.println("-------------------------------------");


		//Write a Java program that swaps two elements in an array list.

		Collections.swap(as, 1,2);
		System.out.println("After Swapping------>"+as);


		System.out.println("-------------------------------------");


		//15. Write a Java program to join two array lists.

		as.addAll(al);
		System.out.println("Join Two ArrayList---->"+as);


		System.out.println("-------------------------------------");

		//	 Write a Java program to clone an array list to another array list.

		ArrayList al2=(ArrayList)as.clone();

		System.out.println("Clone Arraylist------>"+al2);



		System.out.println("-------------------------------------");	

		// Write a Java program to empty an array list.

		ai.removeAll(ai);
		System.out.println("Empty list---------->"+ai);

		System.out.println("-------------------------------------");	

		//18. Write a Java program to test whether an array list is empty or not.

		System.out.println(	ai.isEmpty());

		System.out.println("-------------------------------------");

		//. Write a Java program for trimming the capacity of an array list.

		al.trimToSize();
		for(Object ob1:al)
		{
			System.out.println(ob1);
		}

		System.out.println("-------------------------------------");

		//Write a Java program to increase an array list size.


		al.ensureCapacity(7);
		al.add("Orange");
		al.add("Black");
		al.add("Skin");
		System.out.println("Increase Cpacity------>"+al);

		System.out.println("-------------------------------------");

		// Write a Java program to replace the second element of an ArrayList with the specified element.

		al.set(1, "SkyBlue");
		System.out.println("replace the second element of an ArrayList with the specified element--->"+al);


		System.out.println("-------------------------------------");

		// Write a Java program to print all the elements of an ArrayList using the elements' position.

		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("-------------------------------------");


	}

}
