package oops;
//super can be used to refer immediate parent class instance variable.

//baseclass or super class //same variable name
class car7
{
	String rang1="black";
	void display_color1() 
	{
		System.out.println("Car color is "+ rang1);
	}
}
class Brand extends car7 //subclass
{
	String rang1="red";
	void mahindra() 
	{
		System.out.println("Car color of mahindra  is "+ rang1);
		System.out.println("brand color is "+super.rang1);
	}
}
public class Super_Variable {

	public static void main(String[] args) 
	{
		Brand b=new Brand();
		b.mahindra();
	}

}
