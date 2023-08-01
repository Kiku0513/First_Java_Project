package guviCodeKata;

import java.util.Scanner;

public class MinAmongTENnO {

	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter 10 numbers:");
	        
	        int min = Integer.MAX_VALUE; // Initialize min to the maximum possible integer value
	        
	        // Read 10 numbers and find the minimum
	        for (int i = 0; i < 10; i++) {
	            int number = scanner.nextInt();
	            min = Math.min(min, number);
	        }
	        
	        System.out.println(min);
	        
	       
	    }
	}
