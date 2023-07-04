package guviCodeKata;
import java.util.Scanner;
public class DuplicatesOfString 
{

	public static String convert(String str) {
		int i = 0;
		while (true) 
		{
			i = 0;
			while (i < str.length()) 
			{
				if (str.charAt(i) == ' ') 
				{
					char nextChar = Character.toUpperCase(str.charAt(i+1));
					str = str.substring(0, i) + nextChar + str.substring(i+2);
					break;
				}
				i++;
			}
			if (i == str.length()) {
				break;
			}
		}

		return str;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(convert(str));}
}





