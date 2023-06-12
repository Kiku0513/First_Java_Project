package oops;
interface Charger
{
	void typesofCharger();
	
}
interface Charger1

{
	void typesofCharger();
}
public class Multiple_Inhertance_Interface_Same_Methodname implements Charger,Charger1
{

	

	@Override
	public void typesofCharger()
	{
System.out.println("TYpe c");		
	}
	public static void main(String[] args)
	{
		Multiple_Inhertance_Interface_Same_Methodname m=new Multiple_Inhertance_Interface_Same_Methodname();
		m.typesofCharger();
	}

}
/*//We are going to see how to solve multiple inheritance problem through interface


interface Car8
{
	void carBrake();
}

interface Car9
{
	void carBrake();
}



public class MutipleInheritanceInterface2 implements Car8,Car9 {
	
	@Override
	public void carBrake() {
		System.out.println("Changing the brake of the car");		
	}
	
	public static void main(String[] args) {

		MutipleInheritanceInterface2 obj = new MutipleInheritanceInterface2();
		obj.carBrake();
	}

	
	


	

	
}


}*/