package coreJava;
import java.io.*;
public class FileWrite {

	public static void main(String[] args) throws IOException 
	{
		//FileWriter
		FileWriter fwrite=new FileWriter("C:\\Users\\ashis\\eclipse-workspace\\Java_Project\\src\\coreJava\\Sample.txt");
		String str="We joined zEN Guvi";
		fwrite.write(str);
		fwrite.close();
		System.out.println("Operation Suffecfull");
		
		
		
		//BufferWriter
		
		BufferedWriter brWriter= new BufferedWriter(new FileWriter("C:\\Users\\ashis\\eclipse-workspace\\Java_Project\\src\\coreJava\\Sample.txt"));
	String str1="we are learning core java";
	brWriter.write(str1);
	brWriter.close();
	System.out.println("Operation Success");
	
	
	}

}
/*String writeString="We are learning file operations";

fwrite.write(writeString);

fwrite.close();

System.out.println("File writing operation successful");
*/

///BufferedWriter


/*BufferedWriter brWriter= new BufferedWriter(new FileWriter("C:\\\\Users\\\\Guest User\\\\guvilearning\\\\Javaguv\\\\src\\\\corejava\\\\sample.txt"));

String str="Writing using Bufferred WRiter";
brWriter.write(str);

brWriter.close();

System.out.println("File writing successful");
*/