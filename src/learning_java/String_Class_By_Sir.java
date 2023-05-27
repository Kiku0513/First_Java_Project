package learning_java;

public class String_Class_By_Sir
{

	public static void main(String[] args) {

		String str= "java";

		str=str.concat(" is a programming language");

		System.out.println(str);
		//System.out.print(str);

		String str1= str.toUpperCase();
		System.out.println(str1);

		String str2= str1.toLowerCase();
		System.out.println(str2);

		char str3= str.charAt(4);
		System.out.println(str3);

		String str4= str.replace("a", "e");
		System.out.println(str4);

		String str5= str.replace("is", "was");
		System.out.println(str5);

		boolean str6= str.contains("is");
		System.out.println(str6);

		boolean str7= str.contains("was");
		System.out.println(str7);

		String str8="";
		boolean emptyString= str8.isEmpty();
		System.out.println(emptyString);

		String str9 ="hello";
		String str10="Hello";

		boolean equalString= str9.equals(str10);
		System.out.println("Equals-->"+equalString);

		boolean equalIgnoresString= str9.equalsIgnoreCase(str10);
		System.out.println("Equals Ignores case-->"+equalIgnoresString);

		//end index is exlusive and begining index is inclusive. It will print from 1 to 9
		String str11= str.substring(2, 10);
		System.out.println("Substring-->"+str11);

		String str12= str.substring(2);
		System.out.println("Substring without end index-->"+str12);

		int lengthOfString= str9.length();
		System.out.println(lengthOfString);

		int ch=str9.indexOf("o");
		System.out.println("Index of -->"+ch);












	}

}
