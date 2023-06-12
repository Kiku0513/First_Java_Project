package oops;
interface TV
{
	void name();
	default void inches()
	{
		System.out.println("44 inches");
	}
	static void sound()
	{
		System.out.println("Doolby is Sound");
	}
	
}

public class Default_Static_Method_IN_Interface implements TV
{

	

	@Override
	public void name() 
	{
System.out.println("The name of the Tv is Sony Bravia");		
	}
	public static void main(String[] args) 
	{
		Default_Static_Method_IN_Interface d=new Default_Static_Method_IN_Interface();
		d.inches();
		d.name();
		TV.sound();

	}


}
/* package oops;  //deault and static

//From Java8 , default method is supported inside an interface
//From Java9, static method is also supported inside an interface


interface BikeColor
{
	void getBikeColor();
	
	default void changeColor()
	{
		System.out.println("Changing the bike color");
	}
	
	static void setColor()
	{
		System.out.println("Setting the color of the bike");
	}
	
	
	
}
public class DefaultAndStaticInInterface implements BikeColor {
	
	@Override
	public void getBikeColor() {

			System.out.println("Get the color of the bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultAndStaticInInterface obj= new DefaultAndStaticInInterface();
		obj.changeColor();
		obj.getBikeColor();
    BikeColor.setColor();
    
		
	}

	

}


}
*/
