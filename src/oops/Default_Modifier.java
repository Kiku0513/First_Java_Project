package oops;

class Default
{
	int a=10;
	void method2() {
		System.out.println("No is "+ a);
	}
}
public class Default_Modifier 
{
	public static void main(String args[])
	{
		Default def=new Default();
		def.method2();
		
	}

}
