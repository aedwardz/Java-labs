/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/30/2024
 * 
 * Lab 14.7: Insertion Sort
 * 
 * This program takes integer inputs that are used to fill an integer 
 * array. The array is then passed through a method that sorts it using the
 * insertionSort algorithm. The algorithm is modified to keep track of comparisons, 
 * swaps, and outputs them after the algorithm is done running.
 */

import java.util.Scanner;

public class LabProgram {
	static int comparisons = 0;
	static int swaps = 0;
   // Read and return an array of integers.
   // The first integer read is number of integers that follow.
   private static int[] readNums() {
      Scanner scnr = new Scanner(System.in);
      int size = scnr.nextInt();                // Read array size
      int[] numbers = new int[size];            // Create array
      for (int i = 0; i < size; ++i) {          // Read the numbers
         numbers[i] = scnr.nextInt();
      }
      return numbers;
   }

   // Print the numbers in the array, separated by spaces
   // (No space or newline before the first number or after the last.)
   private static void printNums(int[] nums) {
      for (int i = 0; i < nums.length; ++i) {
         System.out.print(nums[i]);
         if (i < nums.length - 1) {
            System.out.print(" ");
         }
      }
      System.out.println();
   }

   // Exchange nums[j] and nums[k].
   private static void swap(int[] nums, int j, int k) {
      int temp = nums[j];
      nums[j] = nums[k];
      nums[k] = temp;
   }

   // Sort numbers
   /* TODO: Count comparisons and swaps. Output the array at the end of each iteration. */
   /**
    * 
    * @param numbers
    */
   public static void insertionSort(int[] numbers) {
      int i;
      int j;

      for (i = 1; i < numbers.length; ++i) {
         j = i;
         // Insert numbers[i] into sorted part,
         // stopping once numbers[i] is in correct position
         while (j > 0 && numbers[j] < numbers[j - 1]) {
        	 
            // Swap numbers[j] and numbers[j - 1]
        	comparisons++;
            swap(numbers, j, j  - 1);
            swaps++;
            --j; 
            
         }
         
         if (j>0) {
        	 comparisons++;
         }
         
         printNums(numbers);
         
      }
      
      
   }

   public static void main(String[] args) {
      // Step 1: Read numbers into an array
      int[] numbers = readNums();

      // Step 2: Output the numbers array
      printNums(numbers);
      System.out.println();

      // Step 3: Sort the numbers array
      insertionSort(numbers);
      System.out.println();

      // step 4
      /* TODO: Output the number of comparisons and swaps performed */
      System.out.println("comparisons: " + comparisons);
      System.out.println("swaps: " + swaps);
      
      
   }
}
