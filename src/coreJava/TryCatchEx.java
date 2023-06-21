package coreJava;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * try
		 * {
		 *		code which will throw exception
		 * }
		 * catch(Exception ex)
		 * {	
		 * 	thrown exception would be caught here
		 * 
		 * }
		 */
		
		int a,b,c;
		a=10;
		b=0;
		
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		System.out.println("Outside of try catch block");

	}

}
