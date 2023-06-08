package oops;
class Vehicle2
{
	static int price;
	String Vname;
	static String model;

	void Data()
	{
		System.out.println(Vname  +";"+model  +"="+price);
	}
	static //only static variable get intiliazed
	{
		price=90000;
		model="super";
		System.out.println("Inside static block");
	}

}
public class Static_Block {

	public static void main(String[] args)
	{ 
		Vehicle2 v2=new Vehicle2();
		v2.Vname="wego";
		v2.Data();

	}

}
/*package oops;

class VehicleDetails2
{
	String vehicleName="scooty";
	int price=60000;
	static String vehicleType;

	
	VehicleDetails2()
	{
		System.out.println("Inside the contructor");
	}
	
	
	void displayData()
	{
		System.out.println("Inside non static method");
		System.out.println(vehicleName+":"+price+":"+vehicleType);
	}
	
	//we use use static block to initialize static variables
	static
	{
		System.out.println("inside");
		System.out.println("inside static block");
		vehicleType="2-Wheeler";
}
}


public class StaticBlockEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleDetails2 obj = new VehicleDetails2();
		obj.displayData();

	}

}

*/