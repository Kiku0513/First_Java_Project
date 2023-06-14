package assingment;
class DataHiding
{
	private int rollno;
	private String nam;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("The roll no of the student is  "+ rollno);
	}
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
		System.out.println("The name of the studentr is "+nam);
	}
	
	
}
public class Data_Hiding {

	public static void main(String[] args)
	{
		DataHiding d=new DataHiding();
		d.setNam("Komal");
		d.setRollno(12);
		d.getNam();
		d.getRollno();
	}

}
