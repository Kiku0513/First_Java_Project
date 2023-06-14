package assingment;

public class No_Of_Occurence_of_Given_Char
{
public static void main(String args[])
{
	int count=0;
	char c='e';
	String s="Learning Selenium";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==c)
		{
			count++;
		}
	}
	System.out.println("The Occurence of given char is "+count);
}
}
