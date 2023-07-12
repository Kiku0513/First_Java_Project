package coreJava;
import java.util.*;
public class LinkedHashSetEx {

	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("KOMAL");
		lhs.add(659);
		lhs.add("True");
		lhs.add(null);
		
		System.out.println("LinkedHashSet ------>"+lhs);
		
		
	System.out.println("Size of the set is ----->"+lhs.size());
	
	
for(Object obj:lhs)
	{
		System.out.println(obj);
	}
	
	//2
	/*for(int i=0;i<lhs.size();i++)
	{
		//System.out.println(lhs.g);
	}

	}
	
	//Iterator it=lhs.hasnext();
	
	*/
	
	
	lhs.remove(0);
	
	
	}
	

}
