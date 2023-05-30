package assingment;

public class Duplicates_Words_from_String {

	public static void main(String[] args)
	{
		String str[]= {"Komal","Komal","Sadhana","Ashish","Sadhana"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicates words from string is "+str[j]);
				}
			}
		}


	}

}
