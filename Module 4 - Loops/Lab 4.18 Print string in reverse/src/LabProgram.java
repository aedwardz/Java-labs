/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/22/2024
 * 
 * Lab 4.18: Print string in reverse
 * 
 * This program repeatedly takes string inputs until the input is either "done", "Done",or "d". While taking input, that string is
 * reversed, and then output to the console. Instead of starting i from 0, the program starts at input.length() - 1, which is the end
 * of the string. Instead of increasing i by 1, i is decreased by 1 until less than 0.
 * */

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String reversed = ""; // reversed string to be built
		
		String input = scnr.nextLine();
		while (!(input.equals("Done") || input.equals("done") || input.equals("d"))) {
			for (int i = input.length() - 1; i >= 0; i--) {
				reversed += input.charAt(i);
			}
			System.out.println(reversed);
			reversed = "";
			input = scnr.nextLine();
		}
		
		
	}

}
