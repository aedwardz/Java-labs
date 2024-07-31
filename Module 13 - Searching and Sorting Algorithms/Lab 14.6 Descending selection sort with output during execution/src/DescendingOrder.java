/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/30/2024
 * 
 * Lab 14.6: Descending selection sort with output during execution
 * 
 * This program takes integer inputs until a -1 is given. Each valid 
 * input is inserted into an array, while the number of elements is kept track of
 * Using the method selectionSortDescendTrace, the selection sort algorithm is used to sort 
 * the array. The elements are output after each iteration of the outer loop.
 */
import java.util.Scanner;

public class DescendingOrder {
   // TODO: Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
	
	/**
	 * Sorts an array using selection sort, printing the elements after each 
	 * iteration of the outer loop
	 * @param numbers Array of integers
	 * @param numElements integer number of elements in the array numbers
	 */
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {
	   for (int i = 0; i < numElements-1; i++) {
		   int indexSmallest = i;
		   
		   for(int j = i + 1; j < numElements; j++) {
			   if (numbers[j] >= numbers[indexSmallest]) {
				   indexSmallest = j;
			   }
		   }
		   int temp = numbers[i];
		   numbers[i] = numbers[indexSmallest];
		   numbers[indexSmallest] = temp;
		   for (int x = 0; x < numElements; x++) {
			   System.out.print(numbers[x] + " ");
		   }
		   System.out.println();
		   
	   }
	   
   }
   
   
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];

      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.
      input = scnr.nextInt();
      while(i < 10 && input != -1) {
    	  numbers[i] = input;
    	  i++;
    	  numElements++;
    	  input = scnr.nextInt();
      }
      selectionSortDescendTrace(numbers ,numElements);

   }
}

