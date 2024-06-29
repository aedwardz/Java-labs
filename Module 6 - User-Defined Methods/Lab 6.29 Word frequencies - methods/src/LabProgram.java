/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/28/2024
 * 
 * Lab 6.29: Word frequencies - methods
 * 
 * This program takes an integer input representing the number of elements to inserted in the later defined array words.
 * It then takes String inputs and inserts them in the array.Lastly, the each String in the array is printed along with its 
 * frequency in the list, ignoring the case. The frequency is calculated in the function getWordFrequency.
 */
import java.util.Scanner;

public class LabProgram {
	/**
	 * Finds the number of occurrences of a given word in an array
	 * 
	 * @param words: an array of Strings
	 * @param size: The number of elements in words
	 * @param target: String to be counted in the array words
	 * @return the number of occurrences of target in words
	 */
	public static int getWordFrequency(String words[], int size, String target) {
		int count = 0;
		
		for (String word: words) {
			if (word.equalsIgnoreCase(target)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numElements = scnr.nextInt();
		String [] words = new String [numElements];
		
		for (int i = 0; i < numElements; i++) {
			words[i] = scnr.next();
		}
		for (String word: words) {
			System.out.printf("%s %d\n", word, getWordFrequency(words, numElements, word));
		}
		
	}
}
