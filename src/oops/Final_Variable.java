package oops;

/*
 * Java Final keyword is used to restrict the user and it can be used along with Variables, methods and classes
 */

//When i have declared a variable as final, i cannot change its value with same varibale name
public class Final_Variable
{
	final int roll_no=20;
	void rollno()
	{
		//	roll_no=10;
		System.out.println("Roll no is  "+roll_no);
	}
	public static void main(String[] args)
	{
		Final_Variable f=new Final_Variable();
		f.rollno();

	}}
