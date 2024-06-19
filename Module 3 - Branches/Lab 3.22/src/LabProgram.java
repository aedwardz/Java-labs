/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/19/2024
 * 
 * lab 3.22.1: Smallest number
 * 
 * This program takes three integer inputs and outputs the minimum value of the 3
 * I assign the three inputs to the variables, a, b, and c respectively. Then, after a sequence of
 * comparing their values, I output the value that is the smallest. In each comparison, I use the
 * "<=", and "&&" operands to logically compare them 
 * 
 * */
import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int a = scnr.nextInt();
		int b = scnr.nextInt();
		int c = scnr.nextInt();
		
		if (a <= b && a <= c) {
			System.out.println(a);
		}
		else if (b <= a && b <= c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
}
