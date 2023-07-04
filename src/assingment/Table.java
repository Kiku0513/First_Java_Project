package assingment;
import java.util.Scanner;
public class Table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for generating tables");
		int m=sc.nextInt();

		System.out.println("Enter the upto value for table generation");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			int res=(i*m);//(1*2)
			System.out.println(m+"*"+i+"="+res);
	
		}
		sc.close();
	}
}
