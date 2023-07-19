package assingment;
import java.util.*;
public class TreeSet_HasSetNullPoint {

	public static void main(String[] args) {
      TreeSet ts=new TreeSet();
      
      ts.add(100);
      ts.add(null);
      System.out.println(ts);
      
      HashSet hs=new HashSet();
      hs.add(1001);
      hs.add(null);

	}

}
