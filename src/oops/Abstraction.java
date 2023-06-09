package oops;
abstract class Names

{
	abstract void colorname();
	void flowername()

	{
		System.out.println("Flowername is LilY");
	}
}
public class Abstraction extends Names
{
	@Override
	void colorname()
	{
		System.out.println("Color is Red");		
	}


	public static void main(String[] args)
	{
		Abstraction ab=new Abstraction();
		ab.flowername();
		ab.colorname();
	}
/*package oops;

//Abstract class can have both abstract and non-abstract methods
//we cannot create object for an abstract class instead we cant create object for its implementing class(AbstractClassEx)

  abstract class Bike10
{
	 //If we are not defining (writing logic) a method, then that method becomes an abstract method
	abstract void gear();
	
	void accelerate()
	{
		System.out.println("Accelerating the Bike");
	}
}
  
  abstract class Bike11 extends Bike10
  {
	  abstract void refuel();
	  
	  void changeColor() {
		  System.out.println("Changing the color of bike");
	  }
  }

public class AbstractClassEx extends Bike11{

	void gear() {
		System.out.println("Changing the gear");
		
	}
	
	@Override
	void refuel() {
		System.out.println("Refuel");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClassEx obj = new AbstractClassEx();
		obj.accelerate();
		obj.gear();
		obj.refuel();
		obj.changeColor();
		
		//cannot create object or instance to an abstract class(Bike10)
		//Bike10 obj1= new Bike10();
		
		

	}
*/


}
