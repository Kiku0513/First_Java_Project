package assingment;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedHashSet;

public class PrintDuplicatesinList {

	public static void main(String[] args) 
	{
		
			List<Integer> l=new ArrayList<Integer>();

			l.add(20);
			l.add(30);
			l.add(40);
			l.add(40);
			l.add(50);
			l.add(70);
			l.add(70);
			System.out.println("Full List----->"+l);
			
			LinkedHashSet ll=new LinkedHashSet();
			
			for(int i:l)
			{
				if(ll.add(i)==false)
				{
					System.out.println("Only Duplicates-------->"+i);
				}
			}
			
	}

}
