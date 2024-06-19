/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 
 * Lab 3.25: Leap year
 * 
 * This program takes an integer input representing a year and determines if it is a leap year or not. 
 * It performs a sequence of if else statements, some of them being nested to check if the year is divisible by four.
 * If the year is a century year, then it must be divisible by 400. I test these using modulo
 * */

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int year = scnr.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " - leap year");
				}
				else {
					System.out.println(year + " - not a leap year");
				}
			}
			else {
				System.out.println(year + " - leap year");
			}
		}
		else {
			System.out.println(year + " - not a leap year");
		}
	}
}
