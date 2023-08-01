package patterns;
import java.util.Scanner;
public class NumbersProgram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	   int m=sc.nextInt();
	   int temp, size;
	   int array[]=new int[5];
	   for(int i=0;i<m;i++)
	   {
		   array[i]=sc.nextInt();
	   }
	   for(int i=0;i<m;i++)
	   {
		   System.out.print(array[i]+" ");
	   }
	   size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println(array[size-2]);
 }


}
