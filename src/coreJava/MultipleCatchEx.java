package coreJava;

public class MultipleCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			String s=null;
			System.out.println(s.charAt(3));
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
