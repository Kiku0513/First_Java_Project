package assingment;

public class String_Methods 
{

	public static void main(String[] args)
	{
		String s="Welcome to pune";
		String s1="Welcome to pune";


		int s2=s.codePointAt(2);
		System.out.println(s2);

		int s3=s.codePointBefore(4);
		System.out.println(s3);

		int s4=s.codePointCount(2, 3);
		System.out.println(s4);

		int s5=s.compareTo(s1);
		System.out.println(s5);


		int s6=s.compareToIgnoreCase(s1);
		System.out.println(s6);

		boolean s7=s.endsWith("p");
		System.out.println(s7);

		boolean s8=s.startsWith("w");
		System.out.println(s8);

		int s9=s.lastIndexOf("t");
		System.out.println(s9);

		String s10=s.trim();
		System.out.println(s10);

		boolean s11=s.isBlank();
		System.out.println(s11);

		boolean s12=s.contentEquals("abb");
		System.out.println(s12);

		boolean s13=s.matches(s1);
		System.out.println(s13);

		String s14=s.toLowerCase();
		System.out.println(s14);
		
	}

}
