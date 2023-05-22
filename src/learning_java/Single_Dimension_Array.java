package learning_java;

public class Single_Dimension_Array 
{
	//Array is used to store the values of similar type in contiguous memory. Array index or subscript will start from 0.

	public static void main(String args[])
	{
		int marks[]=new int[5];
		marks[0]=60;
		marks[1]=70;
		marks[2]=80;
		marks[3]=90;
		marks[4]=50;

		System.out.println(marks[3]);


		int marks1[]= {40,50,60,70,80};
		System.out.println(marks1.length);

		int[] marks2= {45,55,65,75,89};


		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks Series --->"+marks[i]);
		}
		/*for(int i=0;i<marks1.length;i++)
		{
			System.out.println("Marks1 Series--->"+marks1[i]);
		}
		for(int i=0;i<marks2.length;i++)
		{
			System.out.println("Marks2 Series--->"+marks2[i]);
		}*/
	}

}
