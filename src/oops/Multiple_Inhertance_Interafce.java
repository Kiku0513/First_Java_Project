package oops;
interface Car
{
	int price=90000;
	void carprice();
	
}
interface CarColor 
{
	void colorname();
	
}
interface CarSeat 
{
	void carseatColor();
}
public class Multiple_Inhertance_Interafce  implements CarSeat,Car,CarColor
{



	@Override
	public void carprice() {
		// TODO Auto-generated method stub
		System.out.println("Car Price "+price);
	}

	@Override
	public void carseatColor() {
		// TODO Auto-generated method stub
		System.out.println("Carseat color is Brown");
	}

	@Override
	public void colorname()
	{
System.out.println("Car color silver");		
	}
	public static void main(String[] args)
	{
		Multiple_Inhertance_Interafce m=new Multiple_Inhertance_Interafce();
		m.carprice();
		m.carseatColor();
		m.colorname();
	}


}
/*
 * //We are going to see how to solve multiple inheritance problem through interface


interface Car7
{
	String color="black";
	void carColor();
}

interface Car6
{
	void carBrake();
}



public class MutipleInheritanceInterface1 implements Car7,Car6 {
	
	@Override
	public void carBrake() {
		// TODO Auto-generated method stub
		
		System.out.println("Changing the car brake");
		
	}

	@Override
	public void carColor() {
		// TODO Auto-generated method stub
		System.out.println("Color of the car is "+color);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MutipleInheritanceInterface1 obj= new MutipleInheritanceInterface1();
		obj.carBrake();
		obj.carColor();

	}

	
}*/
