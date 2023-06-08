package oops;

//super() can be used to invoke immediate parent class constructor.
//If we dont call the parent class constructor explicitly in the child class, child class constructor would call the parent class constructor implicitly

class Subject //same method name
{
	Subject()
	{
		System.out.println("My Fav Sub IS Java");
	}
}
class Social extends Subject
{
	Social()
	{ 
		super();
		System.out.println("My Fav Sub math");
	}
}


public class Super_Constructor {

	public static void main(String[] args) 
	{
		Social s=new Social();
	}

}
