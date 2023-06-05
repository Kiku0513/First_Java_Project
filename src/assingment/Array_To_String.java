package assingment;

import java.util.Arrays;

public class Array_To_String {

	public static void main(String[] args) 
	{
String [] str= {"Java","is","My","Fav","Languge"};
String [] str2= {"Komal","Nikame"};
String s1=Arrays.toString(str); //Method 1
System.out.println(s1);

//Method 2
String s2=String.join(" ", str2);
System.out.println(s2);

	}

}
