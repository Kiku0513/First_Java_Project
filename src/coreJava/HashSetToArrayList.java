package coreJava;
import java.util.*;
public class HashSetToArrayList
{

	public static void main(String[] args)
	{
		HashSet<String > sh=new HashSet<String>();
		sh.add("Komal");
		sh.add("Ashish");
		sh.add("Shiv");

		ArrayList<String> al=new ArrayList<String>(sh);
		System.out.println(al);

		Collections.shuffle(al);
		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);

		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}

}
