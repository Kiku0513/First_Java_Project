package coreJava;
import java.util.Scanner;
import java.io.*;
public class FileCreation
{

	public static void main(String[] args) throws IOException 
	{
     System.out.println("Enter the Path");
     
     Scanner sc=new Scanner (System.in);
     String path=sc.nextLine();
     
     System.out.println("Enter the File name");
     
     Scanner sc1=new Scanner (System.in);
     String filename=sc1.nextLine();
     
     File f=new File(path+filename+".txt");
    f.createNewFile();
     
    
    //2
    System.out.println("Enter the Path");
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     String path1=bf.readLine();
     
     System.out.println("Enter the name");
     BufferedReader bf1=new BufferedReader(new InputStreamReader(System.in));
     String name1=bf.readLine();
     
     File f1=new File(path1+name1+".txt");
     f1.createNewFile();
     
     
	}

}
/*	System.out.println("Enter the path of the file");
		Scanner sc = new Scanner(System.in);
		
		String path= sc.nextLine();
		
		System.out.println("Enter the file name");
		Scanner sc1 = new Scanner(System.in);
		
		String fileName= sc1.nextLine();
		
		System.out.println("Enter the path of the file ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String path = br.readLine();
		
		System.out.println("Enter the file name");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String fileName = br1.readLine();
		
		
		
		
		File f = new File(path+fileName+".txt");
		f.createNewFile();
		
		
		*/
