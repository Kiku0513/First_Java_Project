package guviCodeKata;
import java.util.*;
public class Practice {


	
		
	 
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
		



	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		
      int i,j,row,col,sum=0;
	row = sc.nextInt();
	col = sc.nextInt();

	int[][] mat = new int[row][col];

		for(i=0;i<row;i++)
		{ 
  		for(j=0;j<col;j++)
  		{ 
      		mat[i][j] = sc.nextInt();
			}
	}
	
		for(i=0;i<row;i++)
		{ 
  		for(j=0;j<col;j++)
  		{ 
     	 		System.out.print(mat[i][j]+"\t");
			}
	 		System.out.println("");
	}

		for(i=0;i<row;i++)
		{ 
  		for(j=0;j<col;j++)
  		{ 
			if(i==j)	
			{
				sum = sum + mat[i][j];
			}
			}
	}

System.out.println(sum) ;
}	
				    
	    }
	




   
  








