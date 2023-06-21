package coreJava;
//create userdefined Exception
public class UserDefinedException 
{
	int age;
    static void age(int age)
    {
	try
	{
		if(age>=18)
		{
			throw new UserDefined();
		}
		
	}
	catch(Exception e)
	{
		System.out.println("Caught the Exception");
		e.printStackTrace();
	}
    }
	public static void main(String[] args) 
	{
          age(2);
	}

}
class UserDefined extends Exception
{
	UserDefined()
	{
		System.out.println("Age is greater than 18");
	}
	UserDefined(String str)
	{
		System.out.println(str);
	}
}


