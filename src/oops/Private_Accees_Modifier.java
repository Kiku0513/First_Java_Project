package oops;


class Private
{
	private String str="Komal";
	private void method1() {
		System.out.println("Example of Private Access Modifier is "+ str);
	}
}
public class Private_Accees_Modifier 
{
	public static void main(String[] args) 
	{
		//Private p=new Private();
		//compile time error
		Default def=new Default();
		def.method2();
		// Default modifier
		
	}
	

}
