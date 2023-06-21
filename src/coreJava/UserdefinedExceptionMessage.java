package coreJava;

public class UserdefinedExceptionMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=10;
			String str="abc";
			System.out.println(Integer.parseInt(str));
		}
		catch(Exception ex)
		{
			System.out.println("User defined exception message--> Number format exception");
			System.out.println(ex);
	
		}
		

	}

}
