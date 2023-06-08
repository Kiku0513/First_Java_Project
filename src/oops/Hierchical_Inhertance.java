package oops;
class Family
{
	void Father()
	{
		System.out.println("Head of the family");
	}
}
class Animal8 extends Family 
{
	void Tiger()
	{
		System.out.println("Head of the Jungle");
	}
}
class Birds8 extends Family
{
	void Peacock()
	{
		System.out.println("Head of the Birds family");
	}
}
public class Hierchical_Inhertance {

	public static void main(String[] args)
	{
		Birds8 b=new Birds8();
		b.Father();
		b.Peacock();

		Animal8 a=new Animal8();
		a.Father();
		a.Tiger();

	}

}
