/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 
 * Lab 3.26: Name format
 * 
 * This program takes an input string representing a full name and formats it into a string with the last name, then initials
 * Since names are separated by spaces, I used that fact to determine the location for each name in the string. The logic behind this is that 
 * if there are 3 names, then there are 2 spaces and if there are 2 names, then there is only one space. Therefore, if there is one space, the
 * firstSpace and lastSpace variables will reference the same space. If there are 2 spaces, then the firstSpace and lastSpace will reference
 * different spaces.
 * */

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String userString = scnr.nextLine();
		
		// these 2 variables hold the index of spaces in the string, signifying the space between names
		int lastSpace = userString.lastIndexOf(' ');
		int firstSpace = userString.indexOf(' ');
		
		if (lastSpace == firstSpace) {
			char firstInitial = userString.charAt(0);
			System.out.printf("%s, %c.\n", userString.substring(lastSpace+1), firstInitial);
		}
		else {
			String lastName = userString.substring(lastSpace+1);
			char firstInitial = userString.charAt(0);
			char middleInitial = userString.substring(firstSpace+1).charAt(0);
			System.out.printf("%s, %c.%c.\n", lastName, firstInitial, middleInitial);
		}
	}
}
