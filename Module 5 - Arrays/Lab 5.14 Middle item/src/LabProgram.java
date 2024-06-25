/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/25/2024
 * 
 * Lab 5.14: Middle Item
 * 
 * This program continuously takes integer inputs until there is a negative number. It stores each value except the negative
 * number in the array, "userValues", and outputs the middle element of the inserted values. userValues is initialized with
 * a length of 9. If 9 elements is ever exceed, it will output that there are too many numbers.
 * */

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user      
      
      int i = 0;
      int size = 0; // Will keep track of the elements inserted into userValues
      int input = scnr.nextInt();
      boolean overflow = false;
      
      while (input >= 0 && !overflow) {
    	  size++;
    	  if (size > 9) {
    		  System.out.println("Too many numbers");
    		  overflow = true;
    	  }
    	  else {
    	  
    		  userValues[i] = input;  
    		  i++;
      		  input = scnr.nextInt();
    	  }
      }
      
      if (!overflow) {
    	  int middleItem = size / 2; //Index of the middle element
    	  System.out.println("Middle item: " + userValues[middleItem]);
      }
   }
}
