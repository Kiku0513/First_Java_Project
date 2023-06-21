package coreJava;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Checked
{
	static void method1() throws InterruptedException
	{
		Thread.sleep(5);	
	}
}
	class Checked1
	{ 
		static void method2()
		{
			File f=new File("C:\\Users\\ashis\\eclipse-workspace\\Java_Projec");
			try 
			{
				FileReader fr=new FileReader(f);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}

		}



	}


public class CompileTimeExcep {

	public static void main(String[] args)
	{
		try
		{
			//method 1 1st we use throws dec
			Checked.method1();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		//2nd method already we use try n cathch
		Checked1.method2();
	}

}
/*package corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsEx {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub

		//Using throws keyword
			try {
				CheckedEx.checkedExceptions();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				
				System.out.println("Inside Filenot found exception");
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Inside Interrupted exception");
				e.printStackTrace();
			}
		

			//Using try/catch block
			CheckedEx1.checkedExceptions();
			
	}

}


class CheckedEx
{

	static void checkedExceptions() throws InterruptedException, FileNotFoundException 
	{
//Interrupted exception
		Thread.sleep(5);

		//FileNotFoundException
		File f= new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\basic\\exceptions.txt");
		FileReader fr= new FileReader(f); 
		
		
		
		
	}
}

class CheckedEx1
{

	static void checkedExceptions() 
	{
//Interrupted exception
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//FileNotFoundException
		File f= new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\basic\\exceptions.txt");
		try {
			FileReader fr= new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}
}

*/
