package onlineProg;

public class StringPract {

	public static void main(String[] args)
	{
String string="My Laptop ";
string=string.concat("is of Lenovo");

System.out.println(string);


int leng=string.length();
System.out.println(leng);

char ch=string.charAt(7);
System.out.println(ch);

String upper=string.toUpperCase();
System.out.println(upper);

String lower=string.toLowerCase();	
System.out.println(lower);

String string1="My LAPTOP Is of Lenovo";
boolean b=string1.equals(string);
System.out.println(b);


System.out.println(string1.equalsIgnoreCase(string));

System.out.println(string.contains("was"));

System.out.println(string.replace("is", "was"));

System.out.println(string.replace('o', '0'));

System.out.println(string.substring(3, 13));

System.out.println(string.substring(5));

System.out.println(string.indexOf('p'));

System.out.println(string.isEmpty());
}

}
