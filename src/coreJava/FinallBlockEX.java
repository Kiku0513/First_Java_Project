package coreJava;

public class FinallBlockEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10;
			String str="123";
			System.out.println(Integer.parseInt(str));
		}
		catch(Exception ex)
		{
			System.out.println("User defined exception message--> Number format exception");
			System.out.println(ex);
	
		}
		finally
		{
			System.out.println("Inside Finally Block-> this would be executed whether exception is thrown or not");
		}
		

	}

}
