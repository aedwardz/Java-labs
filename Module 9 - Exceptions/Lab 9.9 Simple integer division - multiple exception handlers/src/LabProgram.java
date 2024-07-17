/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/16/2024
 * 
 * 9.9 LAB: Simple integer division - multiple exception handlers
 * 
 * This program takes 2 inputs and outputs the first input divided by the second input. Using a try catch block, the 
 * program checks that there is no division by zero and that there is no mismatch if the inputs. Depending on if either of 
 * those exceptions are thrown, a certain error message will be output

 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
	  int divNum;
      
      try {
    	  userNum = scnr.nextInt();
    	  divNum = scnr.nextInt();
    	  System.out.println(userNum / divNum);
      }
      catch (ArithmeticException e) {
    	  System.out.println("Arithmetic Exception: " + e.getMessage());
 
      }
      catch (InputMismatchException e) {
    	  System.out.println("Input Mismatch Exception: " + e.toString());
      }
      }
}
