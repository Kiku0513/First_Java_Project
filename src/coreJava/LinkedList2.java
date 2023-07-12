package coreJava;
import java.util.*;
public class LinkedList2 {

	public static void main(String[] args)
	{
		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList<Integer> lll=new LinkedList<Integer>();

		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(40);

		lll.addAll(ll);
		System.out.println("After Adding in LLL "+lll);

		lll.removeAll(ll);
		System.out.println("Remove "+ lll);

		Collections.sort(ll);
		System.out.println("Sort---"+ll);

		Collections.shuffle(ll);
		System.out.println("Shuffle ------"+ll);

		Collections.sort(ll,Collections.reverseOrder());
		System.out.println("Reversed ----"+ll);





	}

}
