/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/16/2024
 * 
 * 9.10 LAB: Step counter - exceptions
 * 
 * This program takes a single input representing a number of steps. This number is then passed into a method called
 * stepsToMiles and returns a double representing that same number of steps in miles. When passed through that method, 
 * it is checked to make sure that it is a positive value. If not, it throws a user defined Exception.

 */
import java.util.Scanner;

public class LabProgram {
	
	/**
	 * This method converts steps into miles
	 * @param numSteps the number of steps
	 * @return the number of miles converted from steps
	 * @throws Exception When a negative number of steps is passed
	 */
	public static double stepsToMiles(int numSteps) throws Exception {
	   if (numSteps < 0) {
		   throw new Exception("Exception: Negative step count entered.");
	   }
	   else {
		   return numSteps/2000.0;
	   }
	   
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int numSteps = scnr.nextInt();
      double miles;
      
      try {
    	  miles = stepsToMiles(numSteps);
    	  System.out.printf("%.2f\n", miles);
    	  
      }
      catch(Exception e) {
    	  System.out.println(e.getMessage());
    	  
      }
      
      
      
   }
}
