package oops;


//super can be used to invoke immediate parent class method.

//base class or super class
class Birds
{
	String name="Sparow";
	void bird_name()
	{
		System.out.println("Name of the bird is "+name);
		
	}
}
//child class or derived class
class Animals extends Birds
{
	String aniname="chiutai";
	void bird_name()
	{
		System.out.println("Name of the bird is "+aniname);
		
	}
	void zoo()
	{   
		
	
		super.bird_name();
	}
	
}
public class Super_Method {

	public static void main(String[] args)
	{
		Animals an=new Animals();
		an.bird_name();
		an.zoo();
			

	}

}
