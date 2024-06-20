/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 
 * Lab 3.27: Login name
 * This program takes 3 inputs, 2 strings and 1 integer, and creates a logina name out of the information. For practice, I make use of the 
 * conditional expression to assign the firstName variable to being only the first 6 letters of the name. If it is already less than 6 letters,
 * then the whole full name is used. I use the charAt method to get the first initial of the last name and the '%' operand to get the last digit
 * of the integer. I then format the string to be output. 
 * */

import java.util.Scanner; 

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String firstName = scnr.next();
		String lastName = scnr.next();
		int year = scnr.nextInt();
		
		//firstname is assigned the first six letters if its length is greater than that
		firstName = (firstName.length() <= 6 ) ?firstName: firstName.substring(0,6);
		
		char lastInitial = lastName.charAt(0);
		int lastDigit = year % 10;
		
		System.out.printf("Your login name: %s%c_%d\n", firstName, lastInitial, lastDigit);
		
		
	
		
		
	}

}
