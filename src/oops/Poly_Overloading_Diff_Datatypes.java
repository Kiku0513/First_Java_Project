package oops;

//Method overloading with the different data type
class Addition
{
	int a,b;
	void add(int a, int b)
	{

		int result = a+b;
		System.out.println("The addition of 2 int nos is "+result);

	}

	void add(double c, double d)
	{
		double result= c+d;
		System.out.println("The addition of 2 float  nos is "+result);

	}
}


public class Poly_Overloading_Diff_Datatypes 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Addition obj= new Addition();
		obj.add(12.5, 13.3);
		obj.add(12, 12);



	}
}
