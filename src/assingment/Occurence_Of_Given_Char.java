package assingment;

public class Occurence_Of_Given_Char {

	public static void main(String[] args) 
	{
		String str="Welcome to Home";
		/*char ch=str.charAt(4);
		System.out.println(ch);
		*/
		
		char ch='o';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
				
			}
		}
		System.out.println("Max count of particular chartcer is "+count);

	}

}
