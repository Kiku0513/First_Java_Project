package oops;
//super can be used to refer immediate parent class instance variable.

//baseclass or super class //same variable name
class car
{
	String color="black";
	void display_color() 
	{
		System.out.println("Car color is "+ color);
	}
}
class Brand extends car //subclass
{
	String color="red";
	void mahindra() 
	{
		System.out.println("Car color of mahindra  is "+ color);
		System.out.println("brand color is "+super.color);
	}
}
public class Super_Variable {

	public static void main(String[] args) 
	{
		Brand b=new Brand();
		b.mahindra();
	}

}
