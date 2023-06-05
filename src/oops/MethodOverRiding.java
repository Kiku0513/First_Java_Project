package oops;
//Method overriding or Run time polymorphism
//If a child class has a same method name as in parent class without change in method signature, then it is called as Method overriding
/*
* Usage of Java Method Overriding
Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
Method overriding is used for runtime polymorphism

Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an super and child class relationship (inheritance).
*/

class Students
{
	void name() 
	{
		System.out.println("Name of the Studentd is KOmal ");
	}
}

class Marks extends Students
{
	void name()
	{
		System.out.println("KOmal got 90% in the exam");
	}
}
public class MethodOverRiding {

	public static void main(String[] args) 
	{
		Marks m=new Marks();
		m.name();
	}

}
