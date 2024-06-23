/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/22/2024
 * 
 * Lab 4.16: Remove all non alpha characters
 * 
 * This lab takes one string as an input that is a mix of letters, numbers, and special characters.
 * The program then outputs that same string without any non alpha characters. It makes use of the Character 
 * module, checking that each character in the string is non alpha. It then builds up a version of the string
 * that matches the requirement of the output.
 * */
import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input = scnr.nextLine();
		
		
		String alpha = ""; //String to be built
		
		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				alpha += input.charAt(i);
			}
		}
		System.out.println(alpha);
		
	}

}
