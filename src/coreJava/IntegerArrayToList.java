package coreJava;
import java.util.*;
public class IntegerArrayToList {

	public static void main(String[] args)
	{
		//First Way
		Integer i[]= {10,20,30};

		ArrayList val = new ArrayList(Arrays.asList(i));
		System.out.println(val);

		//Second Way

		int[] arr1= {1,2,3,4,5};

		ArrayList val1= new ArrayList();

		for(int value:arr1)
		{
			val1.add(value);
		}

		System.out.println(val1);
	}
}

