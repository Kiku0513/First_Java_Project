package learning_java;

public class Constructor 
{
	int id;
	String name;
	
	Constructor(int i,String n)
	{
		id=i;
		name=n;
	}
	public void StudentData()
	{
		System.out.println("The Id of the Student is " + id +"and the Name of the Student is "+ name);
	}
	public static void main(String[] args)
	{
		Constructor  s1=new Constructor(1,"Komal");
		s1.StudentData();
		
		Constructor s2=new Constructor(2,"Ashish");
		s2.StudentData();
	}

}
