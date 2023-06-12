package oops;
//super can be used to refer immediate parent class instance variable.

//baseclass or super class //same variable name
class car2
{
	String color1="black";
	void display_color1() 
	{
		System.out.println("Car color is "+ color1);
	}
}
class Brand extends car2 //subclass
{
	String color1="red";
	void mahindra() 
	{
		System.out.println("Car color of mahindra  is "+ color1);
		System.out.println("brand color is "+super.color1);
	}
}
public class Super_Variable {

	public static void main(String[] args) 
	{
		Brand b=new Brand();
		b.mahindra();
	}

}
