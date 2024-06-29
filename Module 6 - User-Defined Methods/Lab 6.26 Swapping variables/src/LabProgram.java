import java.util.Scanner;
/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 6/28/2024
 * 
 * Lab 6.26: Swapping variables
 * 
 * This program takes 4 inputs as integers and inserts them into an array. It then passes that array into a function
 * called "swapValues" that switches the elements at the index 0 and 1, then 2 and 3. After the function has completed
 * the program will output the contents of the array in order.
 */

public class LabProgram {
	
	/**
	 * Method that swaps the elements and indexes 0 and 1, then swaps the elements and indexes 2 and 3 
	 * 
	 * @param array an array of length 4
	 */
	public static void swapValues(int array[]) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		
		temp = array[2];
		array[2] = array[3];
		array[3] = temp;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int [] nums = new int[4];
		for (int i = 0; i < 4; i++) {
			nums[i] = scnr.nextInt();
		}
		swapValues(nums);
		
		for (int i = 0 ; i < 4; i++) {
			if (i == 3) {
				System.out.print(nums[i]);
			}
			else {
				System.out.print(nums[i] + " ");
			}
		}
		System.out.println();
	}
}
