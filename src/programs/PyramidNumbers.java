package programs;
import java.util.Scanner;
public class PyramidNumbers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int i, j, k;
		    for (i = n; i >= 1; i--) 
		    {
		        if (i % 2 == 1) k = 1;
		         else k = i;
		        for (j = 1; j <= i; j++)
		        {
		         System.out.print(k);
		        if (i % 2 == 1) k++;
		         else k--;
		    }
		    System.out.println("");
		    }

	}

}
