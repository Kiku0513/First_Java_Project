package learning_java;

public class String_Buffer {

	public static void main(String[] args) 
	{    //1st Way
		StringBuffer sb=new StringBuffer();
		sb.append("Hello Java ");
		sb.append("I m new here");
		System.out.println("String buffer concat  "+ sb);


		//2nd Way

		StringBuffer sb1=new StringBuffer("Welcome ");
		sb1.append("To Guvi");
		System.out.println("2nd way of creating "+ sb1);


		//3rd way 
		StringBuffer sb2=new StringBuffer(20);
		sb2.append("Zen Classes");
		System.out.println("3rd Way  "+sb2);

		/*Methods

	1)insert
	2)delete
	3)replace
	4)substring //string datatype
	5)reverse
	6)charAt()
	7)defaultvalue
	8)ensure capacity
	9)length
		 */



		sb.insert(3,"lerner");
		System.out.println("Insert Method "+sb);

		sb.delete(2, 5);
		System.out.println(sb);

		sb.replace(3, 5, "good");
		System.out.println(sb);

		String sub	=sb.substring(5);//Extract the value
		System.out.println(sub);

		String sub2=sb.substring(3, 7);//in between this two 
		System.out.println(sub2);

		sb.reverse();
		System.out.println(sb);

		char ch=sb.charAt(5);
		System.out.println(ch);

		int i=sb.length();
		System.out.println(i);

		StringBuffer sb3=new StringBuffer();
		int cap=sb3.capacity();
		System.out.println("Default Capacity " + cap);

		sb3.append("Welcome");
		int c=sb3.capacity();
		System.out.println(c);



		/*
		 * new capacity = (old capacity *2) +2;
		 * newcapacity= (16*2)+2 = 32 +2 =34
		 * 
		 */

		sb3.append("My name is Komal Asish Nikame");
		int g=sb3.capacity();
		System.out.println(g);


		//Ensure Capacity

		//ensureCapacity
		StringBuffer sb5= new StringBuffer();
		System.out.println("Default capacity in sb5-->"+sb5.capacity()); //16
		sb3.append("Hello");
		System.out.println("Capacity after appending Hello in sb5-->"+sb5.capacity()); //16
		sb5.append("java is my favorite language");
		System.out.println("After inserting characters more than 16 in sb5-->"+sb5.capacity()); //34

		sb5.ensureCapacity(15);
		System.out.println("checking the capacity when the minimumcapacity (15) < current capacity (34)-->"+sb5.capacity());



		sb5.ensureCapacity(50);
		System.out.println("Checking the capacity when the minimum capacity(50) > current capacity(34)-->"+sb5.capacity());


		/*
		 * new capacity = (old capacity *2) +2;
		 * newcapacity= (34*2)+2 =68 +2 =70
		 * 
		 */


	}
}