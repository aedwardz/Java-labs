/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden 
 * 7/24/2024
 * 
 * 12.10 LAB: Parsing food data
 * 
 * This program takes input a single a file name and a character. Using the filename, the program adds the .txt extension, then reads through its 
 * lines to find each word and add it to the 2D array, "synonyms". It does this by calling the method parseLine. After filling the 2D array with 
 * all contents of the file, the program then calls the function printSynonyms to output all synonyms starting with the specified letter.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
	/**
	 * Traverses the 2D array of synonyms and outputs all words beginning with the specified letter
	 * @param synonyms 2D array of synonyms
	 * @param letter char that output synonyms must start with
	 * @param file String word associated with file
	 */
	public static void printSynonyms(String[][] synonyms, char letter, String file) {
		int index = letter - 97;
		boolean exists = false;
		for (int i = 0; i < synonyms[index].length; i++) {
			
			String word = synonyms[index][i];
			if (word != null) {
				System.out.println(word);
				exists = true;
			}
		}
		if (!exists) {
			System.out.printf("No synonyms for %s begin with %c.\n", file, letter);
		}	
	}
	
	
	
	
	
	/**
	 * Parses a string using a scanner and inputs the words into the corrct index of the 2D array
	 * @param synonyms 2D array of Strings
	 * @param parser Scanner containing the contents of a String
	 */
	public static void parseLine(String[][] synonyms, Scanner parser) {
		String word;
		int letter = 0;
		int i = 0;
		
		while (parser.hasNext()) {
			word = parser.next();
			letter = word.charAt(0);
			synonyms[letter-97][i] = word;
			i++;
		}
	}
	
	
	
	
	
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int NUM_CHARACTERS = 26;      // Maximum number of letters
      int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter

      String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
      String[] words = new String[MAX_WORDS]; // The words of each input line

      /* Type your code here. */
      String file= scnr.next(); 
      String fileName = file  + ".txt";
      char letter = scnr.next().charAt(0);
      
      FileInputStream fStream = new FileInputStream(fileName);
      Scanner reader = new Scanner(fStream);
      String line;
      Scanner lineParser;
      
      while(reader.hasNext()) {
    	  line = reader.nextLine();
    	  lineParser = new Scanner(line);
    	  parseLine(synonyms, lineParser);  	  
      }
      
      //everything is in synonyms    
      printSynonyms(synonyms, letter, file);
 
      
   }
}
