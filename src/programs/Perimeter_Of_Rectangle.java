package programs;

public class Perimeter_Of_Rectangle {

	/*public static void main(String[] args)
	{
		int parameter;
		int lenght=2;
		int width=4;
		parameter=2*(lenght+width);
		System.out.println(parameter);
	}
	 */

	public void primeterOfRect(int l,int w)
	{
		int perimeter=2*(l+w);
		System.out.println("Perimeter of Rectangle is " + perimeter);
	}
	public static void main(String[] args)
	{
		Perimeter_Of_Rectangle obj=new Perimeter_Of_Rectangle();
		obj.primeterOfRect(10, 20);
	}
}
