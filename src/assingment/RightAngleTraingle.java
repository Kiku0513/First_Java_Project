package assingment;
import java.util.Scanner;
public class RightAngleTraingle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		//int col=sc.nextInt();
		for(int i=0;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
		
		}


	}

}
