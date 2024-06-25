/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/25/2024
 * 
 * Lab 5.16: Adjust list by normalizing
 * This program takes an integer input representing how many inputs will be read after it. It then takes that number
 * of double inputs and stores them in a list, while simultaneously checking for a max value. After creating that list, 
 * it normalizes all values by dividing them by the max and outputs the with a space in between them.
 * */

import java.util.Scanner;

public class LabProgram {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		final int NUM_VALS = scnr.nextInt();
		
		double [] userValues = new double[NUM_VALS];
		int i;
		double max = 0; // max value of inputs
		
		for (i = 0; i < NUM_VALS; i++) {
			userValues[i] = scnr.nextDouble();
			if (i == 0) {
				max = userValues[0];
			}
			else {
				if (userValues[i] > max) {
					max = userValues[i];
				}
			}
		}
		
		for (double val: userValues) {
			System.out.printf("%.2f ", val/max);
		}
		System.out.println();
		
	}
}
