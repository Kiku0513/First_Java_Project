package assingment;

public class String_To_StringArray
{
	public static void main(String args[])
	{
		String commaSeparatedStr = "i am learning java language";  
		String[] strArray = commaSeparatedStr.split(" ");   //empty string array  
		//converting using String.split() method with space as a delimiter  
		//printing the converted string array  
		for (int i = 0; i< strArray.length; i++)
		{  
			System.out.println(strArray[i]);  
		}  

	}
}
