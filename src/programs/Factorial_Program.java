package programs;

public class Factorial_Program 
{

	/*public static void main(String[] args)
	{
		int factorialNo=5;
		int factorialResult=1;
		for(int i=1;i<=factorialNo;i++)
		{
			factorialResult=factorialResult*i;

		}
		System.out.println(factorialResult);
	}
	 */

	//By NonStatic Method

	public void factorial(int num)
	{
		int factorial_Result=1;
		for(int i=1;i<=num;i++)
		{
			factorial_Result=factorial_Result*i;
		}
		System.out.println(factorial_Result);
	}

	public static void main(String args[])
	{
		Factorial_Program obj=new Factorial_Program();
		obj.factorial(3);
	}
}
