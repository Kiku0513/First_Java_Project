package assingment;


class CheckPlaindrom
{
	public void palindrom(String str)

	{
		String input=str;
		String rev="";
		int getlength=input.length();
		System.out.println(getlength);
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);

		}
		if(input.equals(rev))
		{
			System.out.println("This is palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
public class Palindrome_No 
{
	public static void main(String[] args) 
	{
		CheckPlaindrom ob=new CheckPlaindrom();
		ob.palindrom("liril");
		ob.palindrom("komal");
		ob.palindrom("Shiv");

	}
	
}

/*first iteration
//i=4,4>=0
//reverse= ""+l 
//reverse=l
 * 
 * 
 * Second iteration
 * i=3, 3>=0
 * reverse= l+i
 * reverse=li
 * 
 * third iteration
 * i=2; 2>=0
 * reverse=li+r
 * reverse=lir
 * 
 * fourth iteration
 * i=1; i>=0
 * reverse=lir+i
 * reverse=liri
 * 
 * fifth iteration
 * i=0;0>=0
 * reverse=liri+l
 * reverse=liril
 * 
 */