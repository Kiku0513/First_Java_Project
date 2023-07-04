package coreJava;
import java.io.*;
import java.util.Scanner;
public class FileRead {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\ashis\\eclipse-workspace\\Java_Project\\src\\coreJava\\komal.txt");
		//1=By usimg Scanner Class
		
		/*Scanner sc=new Scanner(f);
		System.out.println(sc.nextLine());
		sc.close();
		*/
		
		
		//By Buffered Reader
		
	BufferedReader bf=new BufferedReader(new FileReader(f));
	String str;
	while((str=bf.readLine()) !=null)
	{
		System.out.println(str);
	}
	bf.close();
	}

}
/*	
File f = new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\corejava\\inputfile.txt");
/*
 * Using scanner class
Scanner sc = new Scanner(f);

System.out.println(sc.nextLine());
*/


/*
 * Using BufferedReader Class
 * 
 */

/*BufferedReader br = new BufferedReader(new FileReader(f));

String str;
while( (str=br.readLine()) != null)
{
	System.out.println(str);
}



*/