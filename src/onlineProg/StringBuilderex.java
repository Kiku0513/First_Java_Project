package onlineProg;

public class StringBuilderex {

	public static void main(String[] args)
	{
StringBuilder stb=new StringBuilder("Hello ");
stb.append("Welocome here");
System.out.println(stb);

System.out.println(stb.length());

System.out.println(stb.charAt(7));

System.out.println(stb.reverse());

System.out.println(stb.replace(2, 7, "to"));

System.out.println(stb.reverse());

System.out.println(stb.insert(4, "too"));

System.out.println(stb.delete(3, 6));

System.out.println(stb.substring(3));

System.out.println(stb.substring(3, 9));

StringBuilder sb1=new StringBuilder();
sb1.append("Heelo                          ");
System.out.println(sb1.capacity());


	}

}
