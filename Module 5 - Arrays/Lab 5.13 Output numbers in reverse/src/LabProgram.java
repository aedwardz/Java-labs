/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/25/2024
 * 
 * Lab 5.13: Output numbers in reverse
 * 
 * This program takes an integer input that represents the number of integers that will
 * be read after that input. It then takes that number of inputs after, then outputs those
 * numbers in reverse, each with a ", " following it. This is done by initializing an array with the
 * size of the first read integer, then reading the remaining inputs into the array. Finally, using
 * a for loop to output the contents of the array backwards
 * */

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int NUM_VALS = scnr.nextInt();
		int [] nums = new int[NUM_VALS];
		int i;
		for (i = 0; i < NUM_VALS; i++) {
			nums[i] = scnr.nextInt();
		}
		
		for(i = nums.length-1; i > -1; i--) {
			System.out.print(nums[i] + ",");
		}
		System.out.println();
	}
}
