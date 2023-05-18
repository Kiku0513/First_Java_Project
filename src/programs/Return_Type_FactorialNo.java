package programs;

public class Return_Type_FactorialNo 
{
	public int factorial(int num)
	{
		int factResult=1;
		for(int i=1;i<=num;i++)
		{
			factResult=factResult*i;
		}
		return factResult;
	}
	public static void main(String[] args) 
	{
		Return_Type_FactorialNo obj=new Return_Type_FactorialNo();
		int result=obj.factorial(5);
		System.out.println(result);


	}

}
