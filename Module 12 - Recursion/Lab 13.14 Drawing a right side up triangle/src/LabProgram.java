/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/27/2024
 * 
 * Lab 13.13
 * 
 * This program takes a single integer as input. This input must be odd and less than 20.
 * Using the drawTriangle method, the baselength is passed to a separate helper method that allows
 * keeping track of spacing and line length. The program outputs a pyramid.
 */
import java.util.Scanner;

public class LabProgram {
   
   /* TODO: Write recursive drawTriangle() method here. */
	/**
	 * Outputs the triangle with specified base length
	 * @param baseLength
	 */
	public static void drawTriangle(int baseLength) {
		drawTriangleSpaces(baseLength, 9, 1);
	}
	
	
	
	
	/**
	 * Helper function for drawTriangle that keeps track of spacing and number of '*'
	 * per line
	 * @param baseLength integer representing the base of the triangle
	 * @param spaces integer number of spaces before a line
	 * @param len integer number of '*' per line
	 */
	public static void  drawTriangleSpaces(int baseLength, int spaces, int len) {
		for (int i = 0; i < spaces; i++) {
			System.out.print(" ");
		}
		for (int i = 0; i < len;i++) {
			System.out.print("*");
		}
		System.out.println();
		
		if (len == baseLength) {
			return;
		}
		else {
			drawTriangleSpaces(baseLength, spaces-1, len+2);
			
		}
		
	}
	
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int baseLength;
      
      baseLength = scnr.nextInt();
      drawTriangle(baseLength);
   }
}
