package oops;
interface Laptop
{
	void brand();
	void cost();
	
}
public class Interface implements Laptop
{

	@Override
	public void brand()
	{
System.out.println("Brand is Lenovo");		
	}

	@Override
	public void cost()
	{
System.out.println("Cost is 80k");		
	}
	public static void main(String[] args) 
	{
		Interface in=new Interface();
		in.brand();
		in.cost();
		
	}
}
/*package oops;

/*
 * Syntax for creating an interface
 * 
interface interfaceName
{
	
}
*/

/*interface BikeDetails
{
	void gear();
	void acclerate();
}

public class InterfaceEx1 implements BikeDetails {
	
	@Override
	public void gear() {
			System.out.println("Changing the gear");			
	}
	

	@Override
	public void acclerate() {
		// TODO Auto-generated method stub
		System.out.println("Accelerate the bike");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InterfaceEx1 obj= new InterfaceEx1();
		obj.gear();
		obj.acclerate();
	}

	

}
*/