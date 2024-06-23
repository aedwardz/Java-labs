/*
 * Antonio Edwards
 * CIS 255 Summer 2024 
 * Instructor Dave Harden
 * 6/22/2024
 * 
 * Lab 4.17: Output range with Increment of 5
 * 
 * This lab takes 2 integer inputs and outputs the sequence of numbers following the number in increments of 5 as long as 
 * it does not exceed the second input. It uses a for loop to safely increment i by 5 until it is greater than the 
 * second input.
 * */

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int start = scnr.nextInt();
		int end = scnr.nextInt();
		
		if (end < start) {
			System.out.println("Second integer can't be less than the first.");
			
		}
		else {
			for (int i = start; i <= end; i += 5) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
