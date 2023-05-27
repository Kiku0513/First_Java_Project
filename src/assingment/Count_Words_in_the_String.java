package assingment;

public class Count_Words_in_the_String {

	public static void main(String[] args)
	{
		String str = "java is my fav language";
		  String[] strArray = str.split(" ");
		 int words=strArray.length;
		 //System.out.println(words);
		  System.out.println("Number of words in a string = " + words);
	}

}
 /*int countmax=0;
  * int count min=0;
  * String str="java";
  * for(int i=0;i<str.length();i++)
  * {
  * countmax=countmax+charAt(i);
  * if(countmax.eqauls(a))
  * {
  * countmax++;
  * sysou(max count is)
  * 
  * }
  * 
  */
 