package assingment;

public class SwapString {

	public static void main(String[] args) 
	{
		String str1="Java";
		String str2="Langugae";
		String temp;
		System.out.println("Before Swaping String is : " +str1 +" "+str2);
		temp=str1;
		str1=str2;
		str2=temp;

		System.out.println("After Swaping String is :" + str1 +" "+ str2);
	}

}
