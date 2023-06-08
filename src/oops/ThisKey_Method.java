package oops;
class Apps
{
	void Whatsapp()
	{
		System.out.println("New Version app");
	}
	void Facebook()
	{
		this.Whatsapp();
		//Whatsapp();
		System.out.println("Old Verion App");
	}


}
public class ThisKey_Method {

	public static void main(String[] args)
	{
		Apps app=new Apps();
		//app.Whatsapp();
		app.Facebook();
	}

}
