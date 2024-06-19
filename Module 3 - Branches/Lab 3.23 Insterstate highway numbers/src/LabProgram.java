/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/19/2024
 * 
 * lab 3.23: Interstate highway numbers
 * 
 * This program takes an input representing a highway number and determines whether it is a primary or auxiliary highway, the direction
 * in which it goes, and what highway it serves if it is an auxiliary highway. Depending on the previously mentioned attributes, there
 * can be a few different output strings. To implement this, I first take the input and store it in a variable named "highwayNum". I then
 * check whether the number is odd or even using modulo. After determining the direction in which the road goes, I check for the edge condition
 * that the given number is not between 1 and 999. If it is not, then I output that the given number is not a valid highway number. After checking
 * for the edge condition, I determine the type of Interstate it is and output the appropriate string for it.
 * */
import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int highwayNum = scnr.nextInt();
		String direction; //variable that will hold the direction the highway goes
		
		//conditions to determine direction
		if (highwayNum % 2 == 0) {
			direction = "east/west";
		}
		else {
			direction = "north/south";}
				
		
		//Edge condition
		if (highwayNum < 1 || highwayNum > 999) {
			System.out.println(highwayNum + " is not a valid interstate highway number.");
		}
		
		//conditions to determine type
		else if (highwayNum < 100) {
			System.out.printf("I-%d is primary, going %s.\n",highwayNum, direction);
		}
		else {
			
			int serving = highwayNum % 100; //variable that holds the road the highway serves
			if (serving < 1) {
				System.out.println(highwayNum + " is not a valid interstate highway number.");
			}
			else {
				System.out.printf("I-%d is auxiliary, serving I-%d, going %s.\n", highwayNum, serving, direction);
			}
		}
	}
}
