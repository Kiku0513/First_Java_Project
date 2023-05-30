package oops;

public class Public_Modifier
{
public int a=40;
public void method3()
{
	System.out.println("No is "+ a);
}
	public static void main(String[] args)
	{
		Public_Modifier pub=new Public_Modifier();
		pub.method3();
	}

}
