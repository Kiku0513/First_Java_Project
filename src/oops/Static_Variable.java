package oops;
//Here vehicleName and price are instance variables and its value is dependent on the objects we create for that class
//whereas vehicleType is static variable which means that its value is unique for all the complete class irrespective of the objects we create for the class
//We can access a static variable using classname.variablename (because static variable are class level variables)
class Vehicle
{
	int price;
	static String Vname;
	static String model;
	
	void Data()
	{
		System.out.println(Vname  +";"+model  +"="+price);
	}
}
public class Static_Variable {

	public static void main(String[] args)
	{
		Vehicle v=new Vehicle();
		v.price=67000;
		Vehicle.Vname="Jupiter";
		Vehicle.model="Advanced";
		v.Data();

		Vehicle v1=new Vehicle();
		v1.price=97000;
		v1.Data();
		
	}

}
