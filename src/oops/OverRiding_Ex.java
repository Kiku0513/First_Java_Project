package oops;
//Hierchial Inteheritance
class College
{
	void name()
	{
		System.out.println("Name of the students is Komal");
	}
}
class RollNo extends College
{
	void name()
	{
		System.out.println("Name of the students is Sadhana");
	}
}
class Techers extends College
{
	void name()
	{
		System.out.println("Name of the students is Ashish");

	}
}
class Staff extends College
{
	void name()
	{
		System.out.println("Name of the students is Shiv");	
	}
}
public class OverRiding_Ex 
{
	public static void main(String args[])
	{
		RollNo r=new RollNo();
		r.name();
		Techers s=new Techers();
		s.name();
		Staff m=new Staff();
		m.name();

	}
}
