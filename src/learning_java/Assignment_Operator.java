package learning_java;

public class Assignment_Operator {

	public static void main(String[] args)
	{
		int num1=10;
		/*num1+=10;
		 * num1=num1+10;
		 */

		System.out.println("for num +  = " + (num1+=10));
		System.out.println("for num -  = " + (num1-=10));
		System.out.println("for num *  = " + (num1*=10));
		System.out.println("for num /  = " + (num1/=10));
		System.out.println("for num %  = " + (num1%=10));
		System.out.println("for num == =" + (num1==10));
		
	}

}
