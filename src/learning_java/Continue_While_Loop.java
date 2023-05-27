package learning_java;

public class Continue_While_Loop {

	public static void main(String[] args) 
	{
		int i=0;
		int n=10;
		while(i<=n)
		{
			i++;
			if(i==5)
			{

				continue;

			}
			System.out.println(i);
		}

	}

}
