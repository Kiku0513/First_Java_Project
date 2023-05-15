package learning_java;

public class Logical_Operator {

	public static void main(String[] args)
	{
		int a=20;
		int b=25;
		int c=15;
		boolean val=true;
		System.out.println(" Not Operator for val " + !val);
		
		if((a>b)&&(b>c))
		{
			System.out.println("if block executed");
		}
		else if ((a>b)||(b>c))
		{
			System.out.println(" Else if block Executed");
		}
		else
			
		{
			System.out.println("Only Else bolck will Executed");
		}

	}

}
