package coreJava;
import java.util.Scanner;
import  java.io.*;
public class FileProgramByScanner {

	public static void main(String[] args) throws IOException
	{  
		//Create new File
		System.out.println("Enter The path");
		Scanner sc=new Scanner(System.in);
		String path=sc.nextLine();
		
		System.out.println("Enter The name");
		Scanner sc1=new Scanner(System.in);
		String name=sc1.nextLine();
		
		File f=new File(path+name+".txt");
		f.createNewFile();
		
		//Write File
		FileWriter f1=new FileWriter(f);
		String str="Program was given for practice";
		f1.write(str);
		
		
		//Read File
		File f2=new File("C:\\\\Users\\\\ashis\\\\eclipse-workspace\\\\Java_Project\\\\src\\\\coreJava\\\\program.txt");
		Scanner sca=new Scanner(f2);
		System.out.println(sca.nextLine());
		
		//Delete File
		
		File f3=new File("C:\\\\Users\\\\ashis\\\\eclipse-workspace\\\\Java_Project\\\\src\\\\coreJava\\\\program.txt");
		if(f3.exists())
		{
			f3.delete();
		}
		else
		{
			System.out.println("Error");
		}
		
	}

}
