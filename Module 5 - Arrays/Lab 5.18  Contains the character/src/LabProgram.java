/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/25/2024
 * 
 * Lab 5.18: Contains the character
 * 
 * This program takes an integer input representing the number of strings to be read in. After reading the strings 
 * into the array "words", there is a character to be read in. The program then iterates through each word in the array,
 * checking for the character that was input. If the character is found, then the word is output with a following ",".
 * */

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int NUM_VALS = scnr.nextInt();
		
		String [] words = new String[NUM_VALS];
		
		for (int i = 0; i < NUM_VALS; i++) {
			words[i] = scnr.next();
		}
		
		char target = scnr.next().charAt(0); // character to be found in
		boolean found = false; // will be triggered if the character is found in the string
		
		for (String word: words) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == target) {
					found = true;
				}
			}
			if (found) {
				System.out.print(word + ",");
			}
			found = false;
		}
		System.out.println();
	}

}
