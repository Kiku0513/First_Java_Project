package learning_java;

public class Break_While_loop {

	public static void main(String[] args) 
	{
		int i=1;
		int n=10;
		while(i<=n)
		{
			if(i==8)
			{
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
