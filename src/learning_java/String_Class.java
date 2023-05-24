package learning_java;

public class String_Class{
/*

package basics;

public class StringEx {

	public static void main(String[] args) {
		//In java everything most of the important things are stored in  Strings, so they thoght of creating a separate memory called "String pool" memory

		
		//First way of creating of Strings (String literal)
		
		String s1= "welcome"; 
		String s2= "welcome";
		
		/* values would be stored in different memory locations in heap memory but for string, if the values are same then it will allocate to a single memory location
		int a=10;
		int b=10;
		
		*/
		
		//second way of creating strings
		//str is the object which would in the heap memory but its value would be String pool memory and jave would make the necessary memory mapping for it
		String str= new String("Hello");
		
		
		// to explain string immutability (Once the value is assigned to a string object,  its value cannot be changed)
		
		/*String str1 = new String("Hello");
		String str2=str1.concat("world");
		System.out.println(str1);
		System.out.println(str2);
		*/

	public static void main(String[] args) 
	{
		
		
		
		
		
String str="HELLO";
String str1="HELLO";

	}

}
