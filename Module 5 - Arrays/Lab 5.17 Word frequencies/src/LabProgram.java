/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/25/2024
 * 
 * Lab 5.17: Word frequencies
 * 
 * This program takes an input representing how many words will be read into input after it. It then reads that amount
 * of strings into an array called "words". By using a nested for loop, the program calculates the frequency of each string in
 * the words array and stores that in the frequencies array at the same index as the word in the words array. It then uses that
 * to print statements of each word and its corresponding frequency.
 * */

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		final int NUM_VALS = scnr.nextInt();
		
		String [] words = new String[NUM_VALS];
		int [] frequencies = new int[NUM_VALS];
		int i;
		
		//loop to fill words array with input
		for (i = 0; i < NUM_VALS; i++) {
			words[i] = scnr.next();
		}
		
		//fills frequencies with frequencies of words
		for (int j = 0; j < NUM_VALS; j++) {
			int count = 0;
			for (String word2: words) {
				if (words[j].equals(word2)) {
					count++;
				}
			frequencies[j] = count;
			}
		}
		
		//print statements
		for (i = 0; i < NUM_VALS; i++) {
			System.out.println(words[i] + " - " + frequencies[i]);
		}
	}
}
