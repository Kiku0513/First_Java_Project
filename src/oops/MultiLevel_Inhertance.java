package oops;
class Branches
{
	void ElectricalEngg()
	{
		System.out.println("There are Several brances in Engg find beloww");
	}
}
class Subject8 extends Branches
{
	void Electrical() 
	{
		System.out.println("Electrical is one of them");
	}
}
class Practical extends Subject8 
{
	void EEE()
	{
		System.out.println("ElectriucAL eNGG IS pRACTICAL");
	}
}
public class MultiLevel_Inhertance {

	public static void main(String[] args) 
	{
		Practical pr=new Practical();
		pr.EEE();
		pr.Electrical();
		pr.ElectricalEngg();
	}

}
