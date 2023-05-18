package oops;

public class Methods_Ex {

	/*
	 * Class-> House
	 * Windows, tables etc-> Variables and methods
	 * blueprint -> object
	 * 
	 */



	/*
	 * Methods is a block of code to perform a specific action. Here the objective is to add 2 nos. 
	 * The main objective of methods is code reusability which means the same code will be reused for all the different parameters
	 * accessmodifier returnType methodName(argument1, argument2)
	 * {
	 * 
	 * }
	 * 
	 */
	int num=10;
	public void addTwoNumbers(int a, int b)
	{
		int result= a+b;
		System.out.println("Addition of 2 nos is "+result);
	}

	public static void main(String args[])
	{ 
		//classname object = new classname();
		Methods_Ex obj1= new Methods_Ex();
		System.out.println(obj1.num);
		obj1.addTwoNumbers(10, 8);

		Methods_Ex obj2 = new Methods_Ex();
		//System.out.println(obj2.num);
		obj2.addTwoNumbers(12, 12);






	}

}
