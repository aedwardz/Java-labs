/*Antonio Edwards
CIS 255 Summer 2024
Instructor Dave Harden
6/22/2024

Lab 4.15: Count characters

This program takes two input, a character and a string, and outputs how many times that character shows up in the string.
I use a for loop to the iterate through the entire length of the string, performing a comparison the target character
on each iteration. If there is a match, a count variable is incremented. Based on the value of the count after the loop, 
I choose the appropriate string to output.
*/


import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char target = scnr.next().charAt(0);
		String input = scnr.nextLine();
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == target) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("0 " + target +"'s");
	
		}
		else {
			if (count > 1) {
				System.out.println(count + " " + target + "'s");
				
			}
			else {
				System.out.println(count + " " + target);
			}
		}
	}
}
