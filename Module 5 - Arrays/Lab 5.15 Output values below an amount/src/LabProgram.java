/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/25/2024
 * 
 * Lab 5.15: Output values below an amount
 * This program takes an integer input representing the number of value to be read after that. It then reads that number
 * of inputs into an array, "userValues", then an integer representing a threshold amount. It then goes through userValues
 * and outputs each element less than or equal to the given threshold amount. 
 * */

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

      final int NUM_VALS = scnr.nextInt();
      int i;
      int size = 0;
      
      for (i = 0; i < NUM_VALS; i++) {
    	  userValues[i] = scnr.nextInt();
    	  size++;
      }
      
      int threshold = scnr.nextInt();
      
      for (i = 0; i < size; i++) {
    	  if (userValues[i] <= threshold) {
    		  System.out.print(userValues[i] + ",");
    	  }
      }
      System.out.println();
   }
}