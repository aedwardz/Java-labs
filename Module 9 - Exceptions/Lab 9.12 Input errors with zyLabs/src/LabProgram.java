/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/17/2024
 * 
 * 9.12 LAB: Input errors with zyLabs
 * 
 * This program Takes a maximum of 3 values and returns the max between them. If there are missing inputs, then 
 * the NoSuchElementException is caught in a try-catch block. It then outputs the number of inputs that were read,
 * then outputs the max as long as there is at least one input. If there are no inputs, then "No max" is output. 
 * The max is found in a method called findMax, that uses a series of conditional statements to determine the maximum value

 */
import java.util.Scanner;
import java.util.NoSuchElementException;

public class LabProgram {
	/**
	 * This function takes 3 integers and returns the max between them
	 * @param val1 first integer value
	 * @param val2 second integer value
	 * @param val3 third integer value
	 * @return the max of all three of these values
	 */
	public static int findMax(int val1, int val2, int val3) {
		int max;
		if (val1 > val2 && val1 > val3) {
			  max = val1;
		  }
		else if (val2 > val1 && val2 > val3) {
			  max = val2;
		  }
		else {
			  max = val3;
		  }
		return max;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int val1;
      int val2;
      int val3;
      int max;
      
      val1 = 0;
      val2 = 0;
      val3 = 0;
      
      int count = 0;
      
      try {
      val1 = scnr.nextInt();
      count++;
      
      val2 = scnr.nextInt();
      count++;
      
      val3 = scnr.nextInt();
      count++;
      
      System.out.println(findMax(val1, val2, val3));
      
      
      }
      catch (NoSuchElementException e) {
    	  System.out.println(count + " input(s) read:");
    	  
    	  if (count == 0) {
    		  System.out.println("No max");
    	  }
    	  else {
    		  max = findMax(val1, val2, val3);
    		  
    		  System.out.println("Max is " + max);
    	  }
      }
      
   }
}

