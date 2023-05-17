package programs;

public class Fibonacci_Series 
{

	public static void main(String[] args) 
	{
  
		int i=0;
		int num=10;
		int a=0;
		int b=1;
		int c;
		while(i<=num)
		{
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.println("Fibonacci Series For "+num+" is------>"+c);

		}

	}
}
