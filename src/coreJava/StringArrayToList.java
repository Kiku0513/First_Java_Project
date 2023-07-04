package coreJava;
import java.util.*;

public class StringArrayToList
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String arr[]= {"Dog", "cat", "tiger"};
		
		ArrayList al= new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
		
		Iterator itr= al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
