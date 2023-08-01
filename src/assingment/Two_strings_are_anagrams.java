package assingment;

import java.util.Arrays;

public class Two_strings_are_anagrams {

	public static void main(String[] args)
	{
		String s1="Army";
		String s2="Mary";
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2));

	}

}
