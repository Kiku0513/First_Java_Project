package oops;
interface RBI
{
	void rateofInterest();
}
class Statebank implements RBI
{

	@Override
	public void rateofInterest() 
	{
		System.out.println("Rate of Intesrt for SBI is 7");		
	}		
	}
	

class Axis implements RBI
{

	@Override
	public void rateofInterest()
	{
System.out.println("Rate of Intesrt for Axis is 8");		
	}
	
}
class HDFC implements RBI
{

	@Override
	public void rateofInterest()
	{
		System.out.println("Rate of Intesrt for HDFC is 9");		
	}		
	}
	

public class InterfaceEx 
{

	public static void main(String[] args) 
	{
		Statebank sb=new Statebank();
		sb.rateofInterest();
	
	Axis ax=new Axis();
	ax.rateofInterest();
	
	HDFC hd =new HDFC();
	hd.rateofInterest();
	}

}
/*
 * interface RBI
{
	void rateOfInterest();
	
}

class SBI implements RBI
{

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of Interest is 9");
	}
	
}

class AXIS implements RBI
{

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of interest is 10");
		
	}
	
}

class IDFC implements RBI
{

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("Rate of interest is 11");
		
	}
	
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI sbi = new SBI();
		sbi.rateOfInterest();
		
		AXIS axis= new AXIS();
		axis.rateOfInterest();
		
		IDFC idfc = new IDFC();
		idfc.rateOfInterest();

	}

}

*/
