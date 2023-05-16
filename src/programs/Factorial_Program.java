package programs;

public class Factorial_Program 
{

	public static void main(String[] args)
	{
		int factorialNo=5;
		int factorialResult=1;
		for(int i=1;i<=factorialNo;i++)
		{
			factorialResult=factorialResult*i;

		}
		System.out.println(factorialResult);
	}

}
