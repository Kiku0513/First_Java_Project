package guviCodeKata;
import java.util.*;
public class Practice {


	public static void main(String []args)
	{
		
	 
		/*  Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
	        
	         String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";
	        String res=reverseWord.trim();
	    }  
	//    return reverseWord.trim();  
	        
	       */
		



		{
	        Scanner cs=new Scanner(System.in);
	  String str1;
	  str1=cs.nextLine();
	  char[] str=str1.toCharArray();
	     for(int i=0;i<str1.length();i++)
	     {
	     if(str[i]=='a' || str[i]=='A' || str[i]=='e'|| str[i]=='E' || str[i]=='i'|| 
	       str[i]=='I' || str[i]=='o' || str[i]=='O' || str[i]=='u' || str[i]=='U'|| str[i]==' ')
	     {
	      continue;
	       }
	          else
	           System.out.print(str[i]+" ");
	          }     
	    }
	}






   
  
}







