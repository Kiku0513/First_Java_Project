package learning_java;

public class Two_Dimensional_Array 
{
public static void main(String args[])

{
	int marks[][]=new int[3][3];
	marks[0][0]=45;
	marks[0][1]=55;
	marks[0][2]=65;
	
	marks[1][0]=35;
	marks[1][1]=77;
	marks[1][2]=69;
	
	marks[2][0]=60;
	marks[2][1]=43;
	marks[2][2]=56;
	
	
	for(int i=0;i<marks.length;i++)
	{
		for (int j=0;j<marks.length;j++)
		{
			System.out.println(marks[i][j]);
		}
	}
	
	//2nd Type
	/*int marks1[][]=
		{
				{43,45,67},
				{67,89,54},
				{56,44,77}
		};
	for(int i=0;i<marks1.length;i++)
	{
		for (int j=0;j<marks1.length;j++)
		{
			System.out.println(marks1[i][j]);
		}
	}
	*/
	
}
}
