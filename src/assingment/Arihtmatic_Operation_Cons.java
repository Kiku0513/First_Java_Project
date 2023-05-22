package assingment;

public class Arihtmatic_Operation_Cons 
{  
	int a;
	int b;

	Arihtmatic_Operation_Cons(int c,int d)
	{
		a=c;
		b=d;
	}
	public int addition()
	{
		int add=a+b;
		//System.out.println("Addition of two no is "+ add);
		return add;
	}
	public void substraction()
	{
		int sub=a-b;
		System.out.println("Substraction of two no is "+ sub);
	}
	public void multiplication()
	{
		int mul=a*b;
		System.out.println("Multiplication  of two no is "+ mul);
	}
	public void division()
	{
		int div=(a/b);
		System.out.println("Division of two no is "+ div);
	}
	public void moduelo()
	{
		int mod=(a%b);
		System.out.println("Modulo of two no is "+ mod);
	}

	public static void main(String[] args) 
	{
		Arihtmatic_Operation_Cons obj1=new Arihtmatic_Operation_Cons(10,5);
		int plus=obj1.addition();
		System.out.println("Addition of two no is "+ plus);

		obj1.substraction();
		obj1.multiplication();
		obj1.division();
		obj1.moduelo();

	}

}
