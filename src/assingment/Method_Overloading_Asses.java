package assingment;

public class Method_Overloading_Asses
{
void carname()
{
System.out.println("The name of the car is Skoda");	
}
void carname(String brand)
{
	System.out.println("The Brand is "+brand);
}
void carname(int price)
{
	System.out.println("The price of the car is "+price);
}





public static void main(String[] args)
	{
	Method_Overloading_Asses m=new Method_Overloading_Asses();
	m.carname();
	m.carname(999999);
	m.carname("Volvo");
	}

}
