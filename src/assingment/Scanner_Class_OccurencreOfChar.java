package assingment;

import java.util.Scanner;

public class Scanner_Class_OccurencreOfChar {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter String");

		String name=s.nextLine();
		int count=0;
		char c='a';	

		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println("The Occurence of given char is "+count);
		s.close();
	}

}
