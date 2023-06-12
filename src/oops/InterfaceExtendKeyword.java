package oops;
interface Drawing
{
	void sketchbook();
}
interface PencilColor extends Drawing
{
	void pencilcolor();
}

public class InterfaceExtendKeyword  implements PencilColor
{

	@Override
	public void sketchbook() 
	{
System.out.println("Navneet SketchBook");		
	}

	@Override
	public void pencilcolor()
	{
System.out.println("24 piece color");		
	}
	public static void main(String[] args) 
	{
		InterfaceExtendKeyword it=new InterfaceExtendKeyword();
		it.sketchbook();
		it.pencilcolor();
	}

}/*package oops;  //entended two interface

interface Car10
{
	void accelerateCar();

}

interface Car11 extends Car10
{
	void changeCarColor();
}

public class ExtendTwoInterfacesEx implements Car11 {
	
	@Override
	public void accelerateCar() {
		System.out.println("Accelerate the car");
	}

	@Override
	public void changeCarColor() {
		// TODO Auto-generated method stub
		System.out.println("Change the car color");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtendTwoInterfacesEx obj = new ExtendTwoInterfacesEx();
		obj.accelerateCar();
		obj.changeCarColor();

	}
*/
