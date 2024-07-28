/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/27/2024
 * 
 * Lab 13.11
 * 
 * This program takes two integer inputs. The first input is the starting value, 
 * and the second represents how much the starting value will be decremented until 
 * being lower than 0. If lower, the value is used to increment
 */
import java.util.Scanner;

public class NumberPattern {
   // TODO: Write recursive printNumPattern() method
	/**
	 * Recursively Outputs pattern of num1 successively being subtracted by num2
	 * until less than 0
	 * @param num1
	 * @param num2
	 */
	public static void printNumPattern(int num1, int num2) {
		System.out.print(num1 + " ");
		if(num1 < 0) {
			return;
		}
		
		else {
			printNumPattern(num1 - num2, num2);
			System.out.print(num1 + " ");}

	}
  
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2); 
   } 
} 