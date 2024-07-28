/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/27/2024
 * 
 * Lab 13.13
 * 
 * This program takes a single integer as input. Using the digitCount method, 
 * the number of digits in that integer are recursively counted. The return value of 
 * said method is then printed to the standard output
 */
import java.util.Scanner;

public class LabProgram {
	/**
	 * Recursively counts the number of digits in a number
	 * @param num number with digits to be counted
	 * @return number of digits
	 */
   public static int digitCount(int num) {
	   
	   if ((num / 10) == 0 ) {
		   return 1;
	   }
	   else {
		   return digitCount(num/10) + 1;
	   }
	   
	   
   }
   /* TODO: Write recursive digitCount() method here. */
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num, digits;
      
      num = scnr.nextInt();
      digits = digitCount(num);
      System.out.println(digits);
   }
}
