package oops;
abstract class Emp
{
	Emp()
	{
		System.out.println("Default constructor");
	}
	
	final String color="Red";
	static String name;
	char c;
	
	abstract void details();
}
class Empage extends Emp
{

	void details()
	{
		System.out.println("Age of the Employe is 48");		
	}

}
class Empgender extends Emp
{

	void details()
	{
		System.out.println("The gender of Emp is MALE");		
	}

}
public class Abtsraction_HierchialInheritance
{

	public static void main(String[] args)
	{
		Empgender g=new Empgender();
		g.details();

		Empage a=new Empage();
		a.details();
	}

}
/*//Abstract class can have constructor and its variables can be final, static , non-final and non-static.

abstract class Shape
{
	Shape()
	{
		System.out.println("Shape is a default constructor");
	}
	
	
	final int q=10;
	int b=20;
	static String name="java";
	
	abstract void draw();
}

class Rectangle extends Shape
{
	@Override
	void draw() {
		System.out.println("Drawing an rectangle");		
	}

}

class Circle extends Shape
{

	@Override
	void draw() {
		System.out.println("Drawing an circle");		
		
	}
	
}


public class AbstractClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle obj = new Rectangle();
		obj.draw();
		
		Circle obj1= new Circle();
		obj1.draw();
				

	}

}
------------------------*/
