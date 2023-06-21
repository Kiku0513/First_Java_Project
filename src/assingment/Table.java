package assingment;
import java.util.Scanner;
public class Table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			int res=(i*m);
			System.out.println(res);
	
		}
	}
}
