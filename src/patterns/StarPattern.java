package patterns;
import java.util.*;
public class StarPattern {

	public static void main(String[] args)
	{ Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	
        char c=str.charAt(0);
          int f=0;
     
	for(int i=0; i<str.length(); i++) 
	{
		if(c==str.charAt(i))
	{
			System.out.println("yes");
			f=1;
			break;
	}

	}
	
if(f==0)
{
System.out.println("no");	
}
		
		

	}



	}

