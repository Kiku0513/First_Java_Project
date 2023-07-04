package guviCodeKata;
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size - i; j++)
			{
				if (j == size-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}

}
