package guviCodeKata;
import java.util.*;
public class Print_Int_Spaces {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int size=sc.nextInt();
        int space=sc.nextInt();
        int star=sc.nextInt();
    
      //  int size = 5;
       // int space=3;
       // int star=1;
        for(int i=1; i<=size; i++) // Outer for loop for the no of Rows
        {
        for(int j=1; j<=space; j++) // Inner For Loop for Space
        {
        System.out.print(" ");
        }
        for(int j=1; j<=star; j++) // Inner For Loop for star
        {
        System.out.print(" * ");
        }
        System.out.println();
        space--;
        star++;
        }
	}
}





