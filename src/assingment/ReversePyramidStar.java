package assingment;
import java.util.Scanner;
public class ReversePyramidStar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int star=row;
		int space=0;
		 for(int i=1;i<=row;i++)
		 {
			 for(int j=1;j<=space;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=star;k++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
				space++;
				star--;
		 }
		 

	}

}
/*//PYramid
public static void main(String[] args)
{
	   Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int space=row;
        int star=0;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=space;j++)
            {
                 System.out.print(" ");
            }
            for(int k=0;k<=star;k++)
            {
                 System.out.print("* ");
            }
             System.out.println();
             space--;
             star++;
        }
		
		
	    
}

}*/