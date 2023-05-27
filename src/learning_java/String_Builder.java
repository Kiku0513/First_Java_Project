package learning_java;

public class String_Builder {

	public static void main(String[] args) 
	{
		//String Builder is a mutable (values are changeable) version of the String class
		//the default no . of characters for STring builder is 16

		//first way of creating StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("world");

		System.out.println("sb-->"+sb);

		//second way of creating StringBuilder
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("world");

		System.out.println("Second way of creating stringbuilder-->"+sb1);

		//Third way of creating StringBuilder
		StringBuilder sb2= new StringBuilder(20);
		sb2.append("java");
		sb2.append("language");
		System.out.println("Third way of ceating StringBuilder-->"+sb2);

		//other StringBuilder methods
		sb.insert(1, "java");
		System.out.println("After Inserting in sb-->"+sb);

		//begin index is inclusive and the end index is exclusive
		sb.delete(1,5);
		System.out.println("After deleting in sb-->"+sb);

		sb.replace(5,10,"java");
		System.out.println("After replacing in sb-->"+sb);


		String sub=sb.substring(0,5);
		System.out.println("Extracting Hello from sb-->"+sub);
		System.out.println("Extracting Hello from sb-->"+sb.substring(0,5));

		String sub1= sb.substring(5);
		System.out.println("Extracting Hello from sb-->"+sub1);

		//sb.reverse();
		//System.out.println("reversing sb-->"+sb);

		char ch=sb.charAt(1);
		System.out.println("charAt-->"+ch);

		System.out.println("Length of sb-->"+sb.length());

		StringBuilder sb4= new StringBuilder();
		System.out.println("Default capacity-->"+sb4.capacity());
		sb4.append("Hello");
		System.out.println("Capacity after appending Hello-->"+sb4.capacity());
		sb4.append("java is my favorite language");
		System.out.println("After inserting characters more than 16-->"+sb4.capacity());

		/*
		 * new capacity = (old capacity *2) +2;
		 * newcapacity= (16*2)+2 = 32 +2 =34
		 * 
		 */
		
	}

}
