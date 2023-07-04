package patterns;
import java.util.Scanner;
public class NumbersProgram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	 //  int n=sc.nextInt();
	   int m=sc.nextInt();
	   int a[]=new int[5];
	   for(int i=0;i<m;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   for(int i=0;i<m;i++)
	   {
		   System.out.println(a[i]);
	   }
 }


}
