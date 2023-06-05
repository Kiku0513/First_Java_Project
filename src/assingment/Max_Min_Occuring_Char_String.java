package assingment;

public class Max_Min_Occuring_Char_String
{

	public static void main(String[] args) 
	{
		String str="My fav Language is java";
		String newStr=str.replace("v", "");
		int newcap=newStr.length();
		int result=str.length()-newcap;
		System.out.println("Max ocuuring char is "+result);
	}

}
