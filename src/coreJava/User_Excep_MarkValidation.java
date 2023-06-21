package coreJava;
//if marks of the student is less trhan 40 th ,student mark should be greater than 40
class MarkValid extends Exception
{
	MarkValid()
	{
		System.out.println("Marks is greater than 40");
	}
	/*MarkValid(String str)
	{
		System.out.println("Students marks should be greater than 40");
	}
*/
}


public class User_Excep_MarkValidation
{
int marks;
static void marks(int marks)
{
	try
	{
		if(marks<=40)
		{
			throw new MarkValid();
		}
		}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Caught the Exception");
	}
}

	public static void main(String[] args)
	{
		marks(42);
	}

}
