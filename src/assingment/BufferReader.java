package assingment;
import java.io.*;
public class BufferReader 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
//InputStreamReader i=new InputStreamReader(System.in);
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number");
int a=Integer.parseInt(bf.readLine());

System.out.println("Enter number");
int b=Integer.parseInt(bf.readLine());

System.out.println("Enter name");
String s=bf.readLine();

System.out.println(s);


int c=a+b;
System.out.println(c);


	}

}
