package guviCodeKata;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Practrice
{
public static void main(String[] args)
{
	
        
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int num=1;

for ( int c = 1 ; c <= n ; c++ )
{
   for (int d = 1 ; d <= c ; d++ )
     {
        System.out.print(num+" ");
        num++;
      }
    System.out.println();
  }
    }
    


		
}
