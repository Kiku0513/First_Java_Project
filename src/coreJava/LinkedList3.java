package coreJava;
import java.util.*;

public class LinkedList3 {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add("computer");
		ll.add("Mech");
		ll.add(80);
		ll.add(null);
		ll.add("true");

		System.out.println(ll);

		ll.addFirst("ele");
		System.out.println("After adding First ----->"+ll);

		ll.addLast(70);
		System.out.println("After adding last----->"+ll);


		System.out.println("Remove First ----->"+ll.removeFirst());


		System.out.println("Remove Last----->"+ll.removeLast());

		System.out.println("Get First----- "+ll.getFirst());

		System.out.println("Get Last -----"+ll.getLast());
	}

}
