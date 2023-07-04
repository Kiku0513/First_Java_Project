package assingment;
import java.util.Scanner;
public class RightAngleTraingle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int r=n; r>=1; r--)
        {
            for(int c=r; c>=1; c--)
            {
                System.out.print(c);
            }
            System.out.println();
        }
		
		}


	}


