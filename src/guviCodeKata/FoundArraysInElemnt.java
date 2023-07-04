package guviCodeKata;
import java.util.*;
public class FoundArraysInElemnt {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int  num=sc.nextInt();
		int a,count=0;
		System.out.print("Enter no of arrayt");
		int[] n=new int[num];
		{
			for(int i=0;i<n.length;i++)
			{
				n[i]=sc.nextInt();
			}
			for(int i=0;i<n.length;i++)
			{
				System.out.println(n[i]+" ");
			}
		System.out.println("Enter serach elem");
			a=sc.nextInt();
			for(int i=0;i<n.length;i++)
			{
				if(n[i]==a)
				{
					System.out.println(a);			
				}
				else
				{
					System.out.println("-1");
				}
			}
			
			
		}
	}

}
