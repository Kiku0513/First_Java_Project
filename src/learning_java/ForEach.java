package learning_java;

public class ForEach {

	public static void main(String[] args)
	{

		int[] marks= {90, 78, 89, 67};
		
		/*
		for (int i=0; i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		*/
		/*
		//Syntax
		for (datatype var: collection(or)array)
		{
			
		}
		*/
		
		for(int mark:marks)
		{
			System.out.println(mark);
		}

	}

}
