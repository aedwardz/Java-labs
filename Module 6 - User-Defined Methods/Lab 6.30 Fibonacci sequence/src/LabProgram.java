/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * Lab 6.20: Fibonacci Sequence
 * 
 * This program takes an integer input and outputs the fibonacci value at that index. This
 * is done in a function called fibonacci. The output is structured to show n and the fibonacci
 * sequence at n.
 */

import java.util.Scanner;

public class LabProgram {
   /**
    * Computes the nth value in the fibonacci sequence using a 
    * recursive solution
    * 
    * @param n the index at which we want the fibonacci value
    * @return the fibonacci value
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