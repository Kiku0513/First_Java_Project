package programs;

public class Find_Vowels_inString {

	public static void main(String[] args)
	{
		String str="I love java language";
		int count=0;
		char[] c=str.toCharArray();

		for(char ch:c)
		{
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("No of Vowels in the String is "+ count);
	}

}
