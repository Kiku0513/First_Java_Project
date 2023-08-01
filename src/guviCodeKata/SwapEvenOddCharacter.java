package guviCodeKata;
import java.util.Scanner;
public class SwapEvenOddCharacter
{

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        
	        String result = swapEvenOddCharacters(input);
	        System.out.println(result);
	        
	        scanner.close();
	    }
	    
	    public static String swapEvenOddCharacters(String input) {
	        char[] charArray = input.toCharArray();
	        
	        // Start swapping from index 1 (odd positions)
	        for (int i = 1; i < charArray.length; i += 2) {
	            // Swap characters at positions i and i-1 (even and odd positions)
	            char temp = charArray[i];
	            charArray[i] = charArray[i - 1];
	            charArray[i - 1] = temp;
	        }
	        
	        return new String(charArray);
	    }
	}


