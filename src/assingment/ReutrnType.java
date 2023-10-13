package assingment;

public class Aabc {

	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
		System.out.println(roll);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		Aabc c=new Aabc();
		c.setName("k");
		c.setRoll(0);
		c.getName();
		c.getRoll();
	}

}
