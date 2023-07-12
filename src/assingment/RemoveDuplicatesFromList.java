package assingment;
import java.util.*;
public class RemoveDuplicatesFromList {

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

System.out.println("Before Removing Duplicates---------->"+l);
Set<Integer> s=new LinkedHashSet<Integer>(l);
System.out.println("After Removing Duplicates------>"+s);

	}

}
