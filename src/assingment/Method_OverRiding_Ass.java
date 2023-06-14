package assingment;
class Reliance
{
	void mart()
	{
		System.out.println("Reliance mart");
	}
}
class Star extends Reliance
{
	void mart()
	{
		System.out.println("Star Bazar");
	}
}
public class Method_OverRiding_Ass {

	public static void main(String[] args)
	{
Star s=new Star();
s.mart();
	}

}
