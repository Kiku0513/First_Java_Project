package guviCodeKata;
import java.util.Scanner;
public class HalfPyRaAlbhate {

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();


int alpha = 65;

for (int i = 0; i < n; i++)
{
	for (int k = 0; k < n-i-1; k++) {
        System.out.print(" ");
      }
  for (int j = 0; j <= i; j++) {
    System.out.print((char)(alpha+j)+" ");
  }
  System.out.println();
	
}
	}

}
