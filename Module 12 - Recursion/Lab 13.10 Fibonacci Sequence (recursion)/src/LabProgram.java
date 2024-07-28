/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/27/2024
 * 
 * Lab 13.10 
 * 
 * THis program takes a single integer input. THis integer represents the Nth index of
 * the fibonacci sequence. Using the fibonacci function, a recursive solution is created
 * to calculate the value at N in the sequence, returning that value.
 */

import java.util.Scanner;

public class LabProgram {
   
	/**
	 * Calculates the nth value in the fibonacci sequence
	 * @param n nth value
	 * @return the value at the nth index
	 */
   public static int fibonacci(int n) {
	  if (n < 0) {
		  return -1;
	  }
	  if (n == 0) {
		  return 0;
	  }
	  if (n == 1) {
		  return 1;
	  }
	  return fibonacci(n-1) + fibonacci(n-2);
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}
