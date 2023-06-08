package oops;
class Books
{
	String bookn;
	static int rate;
	int speed;

	Books()
	{
		System.out.println("Inside constructor");
		System.out.println("The speed of the vehichle is  "+speed);
	}
	{
		speed=89;
		System.out.println("Inside instance block");
	}
	static //only static variable get intiliazed
	{
		rate=790;
		System.out.println("Inside static block");
		System.out.println("The price of the book is "+rate);
	}
}
public class Instance_Block {

	public static void main(String[] args)
	{
		Books v3=new Books();
	}


}
/*package oops;

class VehicleDetails10
{
	int vehicleSpeed;
	
	VehicleDetails10()
	{
		System.out.println("Inside constructor");
		System.out.println("Vehicle Speed "+vehicleSpeed);
	}
	
	
	//instance block would be created inside the class but outside of any method
	{
		vehicleSpeed=120;
		System.out.println("Inside instance block");
	}
	
	//static block
	static
	{
		System.out.println("Inside Static block");
	}
	
}

public class InstanceBlockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleDetails10 obj= new VehicleDetails10();
		
		VehicleDetails10 obj1= new VehicleDetails10();//then static block not executed only instance block executed depend on obj

		
		

	}

}
*/
