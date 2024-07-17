/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/16/2024
 * 
 * Lab 9.8: Exceptions with arrays
 * 
 * This program takes a single integer input representing the index of an array to be accessed. Using a try and
 * catch block, the program checks that the index is within the bounds of the array. If it is, then it outputs 
 * the name stored in the array at that index. If not, it prints an error message, then prints the name at the closest
 * valid index

 */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
      int index;

		index = scnr.nextInt();
      /* Type your code here. */
		
		try {
			String name = names[index];
			System.out.println("Name: " + name);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf("Exception! Index %d out of bounds for length 10\n", index);
			if (index < 0) {
				System.out.println("The closest name is: " + names[0]);
			}
			else {
				System.out.println("The closest name is: " + names[9]);
			}
		}
		
   }
}
