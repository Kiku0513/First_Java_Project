package oops;
class Scooty
{
	Scooty()
	{
		System.out.println("Default Const");
	}
	Scooty(String name)
	{
		this();
		System.out.println("Prametarized cons "+name);
	}
}
public class ThisKey_Const
{

	public static void main(String[] args) 
	{
Scooty sc=new Scooty("TVS");
	}

}
