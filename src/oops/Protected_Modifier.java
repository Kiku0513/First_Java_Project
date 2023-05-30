package oops;

public class Protected_Modifier
{
protected int a=20;
protected void display ()
{
	System.out.println("No is -->" + a);
	
}
public static void main(String args[])
{
	Protected_Modifier pm=new Protected_Modifier();
	pm.display();
}
}
