/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/30/2024
 * 
 * Lab 14.8: Binary Search
 * 
 * This program takes an integer input representing the number of
 * elements to be inserted into the ArrayList, that same number of integer inputs
 * to be inserted, and the element to be searched for. The array is then passed
 * into the binary search method and is recursively searched for the target value 
 * while additionally keeping track of recursive calls and comparisons.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {
	static int recursions = 0;
	static int comparisons = 0;
   // Read and return an ArrayList of integers.
   private static ArrayList<Integer> readNums(Scanner scnr) {
      int size = scnr.nextInt();                // Read size of ArrayList
      ArrayList<Integer> nums = new ArrayList<Integer>();
      for (int i = 0; i < size; ++i) {          // Read the numbers
         nums.add(scnr.nextInt());
      }
      return nums;
   }
   
   
   /**
    * Binary search on an ArrayList of Integers
    * @param target integer value being searched
    * @param integers ArrayList of integers
    * @param lower lower bound of array
    * @param upper upper bound of array
    * @return -1 if value is not found, else returns the index of the value
    */
   static public int binarySearch(int target, ArrayList<Integer> integers,
                                    int lower, int upper) {
	   recursions++;
	   
	   if (lower > upper) {
		   recursions--;
		   comparisons--;
		   return -1;
	   }
	   else {
		   int midpoint = (upper + lower) / 2;
		   int mid = integers.get(midpoint);
		   
		   comparisons++;

		   if (mid == target) {
			   return midpoint;
		   }
		   else {
			   

			   if (mid > target ) {
				   comparisons++;
				   return binarySearch(target, integers, lower, midpoint-1);
				   
				   
			   }

			   else {
				   comparisons++;
				   return binarySearch(target, integers, midpoint+1, upper);
			   }
		   }
		   
	   }
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      // Input a list of integers
      ArrayList<Integer> integers = readNums(scnr);

      // Input a target value for the search
      int target = scnr.nextInt();

      int index = binarySearch(target, integers, 0, integers.size() - 1);

      System.out.printf("index: %d, recursions: %d, comparisons: %d\n",
                        index, recursions, comparisons);
   }
}
