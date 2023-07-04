package coreJava;
import java.io.*;
public class Deletefile {

	public static void main(String[] args)
	{
File f=new File("C:\\Users\\ashis\\eclipse-workspace\\Java_Project\\src\\coreJava\\Guvi.txt");
if(f.exists())
{
	f.delete();
}
else
{
	System.out.println("Error in File Deletion");
}

	}

}
/*
public static void main(String args[])
{
	File f = new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\corejava\\sample.txt");
	
	if(f.exists())
	{
		f.delete();
		System.out.println("File got deleted successfully");
	}
	else
	{
		System.out.println("Problem in file deletion");
	}
	
}*/