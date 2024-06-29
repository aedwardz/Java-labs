/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/28/2024
 * 
 * Lab 6.26: Flip a coin
 * 
 * This program takes a single integer input, representing the number of times we want to flip a coin. A random
 * object is passed through a function called "coinFlip" that amount of times and based on the value generated from
 * the random object, a string returned from the function is output. This string is either "Heads" or "Tails" if the 
 * value is 0 or 1 respectively.
 * 
 */

import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   /**
    * This method takes a Random object as a parameter. It generates a random number 0 or 1 and
    * outputs the string "Heads" or "Tails" respectively based on that random number.
    * 
    * @param rand a Random object with a seed of 2
    * @return A string being either "Heads" or "Tails"
    */
   public static String coinFlip(Random rand) {
	   int result = rand.nextInt(2);
	   
	   if (result == 1) {
		   return "Heads";
	   }
	   else {
		   return "Tails";
	   }
	   
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); // Unique seed
      
      int numFlips = scnr.nextInt();
      
      for (int i = 0; i < numFlips; i++ ) {
    	  System.out.println(coinFlip(rand));
      }
      
      // TODO: Complete main here
   }
}
