package assingment;
//. Write a Java Program to reverse a String. Implement it using class and have  method called “reversingString”. 
//Create 2 objects for the same class and supply values for the method

class One
{
	void StringBuilder()
	{
		StringBuilder sb=new StringBuilder("Komal Nikame");
		sb.reverse();
		System.out.println(sb);		
	}
	void StringBuilder1()
	{
		StringBuilder sb=new StringBuilder("Komal");
		sb.reverse();
		System.out.println(sb);	
	}
}
public class Reverse_Ass
{
public static void main(String []args)
{

	One o=new One();
	o.StringBuilder();
	o.StringBuilder1();
}

	}


