package assingment;
import java.io.*;
public class Buuffer_Reader_Occurenceofchar 
{

	public static void main(String[] args) throws IOException
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter String");
String s=br.readLine();
int count=0;
char c='a';	

for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==c)
	{
		count++;
	}
}
System.out.println("The Occurence of given char is "+count);


	}

}
