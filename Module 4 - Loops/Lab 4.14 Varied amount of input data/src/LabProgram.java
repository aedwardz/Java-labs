
/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 
 * Lab 4.14: Varied amount of input data
 * 
 * This program takes integer inputs until the value of the input is negative. It then outputs
 * both the max and the average of all the given inputs. I use the variable, "input", to get the input 
 * from the user, and the loop condition is that input >= 0 to ensure that it is non negative.
 * Within the loop body, I increment the count and add to the sum.
*/
import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//variables to keep track of statistics
		double sum = 0;
		int count = 0;
		int max = 0;
		
		
		int input = scnr.nextInt();
		while (input >= 0) {
			sum += input;
			count++;
			if (input > max) {
				max = input;
			}
			
			input = scnr.nextInt();
			
			
		}
		double average = sum / count;
		System.out.printf("%d %.2f\n",max, average);
		
		
	}

}
