package learning_java;

public class String_Methods 
{
	public static void main(String args[])
	{
		String st="Hello java i new to learn you";
		String str="Hello Java I m New ";
		String s=str.concat("To learn you");
		System.out.println(s);

		char str1=s.charAt(1);
		System.out.println(str1);

		String str2=s.replace("e","a");
		System.out.println(str2);

		String str3=s.toUpperCase();
		System.out.println(str3);

		String str4=s.toLowerCase();
		System.out.println(str4);

		//int s5=s.compareToIgnoreCase(st);
		//System.out.println(s5);
		boolean s6=s.equalsIgnoreCase(st);
		System.out.println(s6);

		String s7=s.replace("ll","ii");
		System.out.println(s7);

		boolean s8=s.contains("youu");
		System.out.println(s8);

		String s9="";
		boolean s10=s9.isEmpty();
		System.out.println(s10);

		boolean s11=s.endsWith("y");
		System.out.println(s11);

		boolean s12=s.startsWith("H");
		System.out.println(s12);
	}
}
