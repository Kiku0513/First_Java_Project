package assingment;

public class String_To_StringArray
{
	public static void main(String args[])
	{
		String commaSeparatedStr = "i,am,learning,java,language";  
		String[] strArray = null;    //empty string array  
		//converting using String.split() method with comma as a delimiter  
		strArray = commaSeparatedStr.split(",");  
		//printing the converted string array  
		for (int i = 0; i< strArray.length; i++)
		{  
			System.out.println(strArray[i]);  
		}  

	}
}
