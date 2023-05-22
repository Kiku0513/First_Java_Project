package assingment;

public class Marks_Grade 
{

//students data
	//OWN SOLVE PROGRAM
	/*
	 * checkPassOrFail (student name, student mark)
	 * {
	 *  if(student mark >= 40)
	 *  {
	 * 		pass
	 * }
	 * else
	 * {
	 * 	fail
	 * }
	 * 
	 *  
	 *  checkGrade
	 *  
	 *  if ( student is pass)
	 *  
	 *  {
	 *  if (mark >==85)
	 *  {
	 *  grade a
	 *  }
	 *  else if(mark   >= 70 and mark <85)
	 *  {
	 *  grade b
	 *  }
	 *  else if (mark >=50 and mark <70)
	 *  {
	 *  grade c
	 *  }
	 *  else if (mark < 50)
	 *  {
	 *  grade d
	 *  }
	 *  }
	 *  else
	 *  {
	 *  ("Student has failed and hence grade is not given")
	 *  }
	 *
	 */

	String cadname;
	int cadmarks;
	public int checkPassorFail(String name,int marks)
	{
		cadname=name;
		cadmarks=marks;

		if(cadmarks>=40)
		{
			System.out.println("The name of the Student is " + cadname +" got marks "+ cadmarks +" is PASS in the Exam ");
		}
		else
		{
			System.out.println("Thn Student is FAAIL");
		}
		return cadmarks;
	}

	public int grade( int result) 
	{ 
		if(result==cadmarks)
		{
			if(cadmarks>=85)
			{
				System.out.println("Got Grade A");
			}
			else if(cadmarks>=70 && cadmarks<85)
			{
				System.out.println("Got Grade B");
			}
			else if(cadmarks>=50 &&cadmarks<70)
			{
				System.out.println(" Got Grade C");
			}
			else if(cadmarks>=40 && cadmarks<50)
			{
				System.out.println("Got Grade D");
			}

			else
			{
				System.out.println("Student is fail thats why there is no grade");
			}
		}
		return result;
	}

	public static void main(String[] args) 
	{
		Marks_Grade obj1=new Marks_Grade();
		int result=obj1.checkPassorFail("Komal",35);
		obj1.grade(result);



	}

}
