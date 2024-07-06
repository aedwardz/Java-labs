/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/5/2024
 * 
 * Lab 7.23: Triangle area comparison 
 * 
 * This program takes three integer inputs represent various attributes of a car. After creating getters,
 * setters, and print methods for the Car class, you use these inputs to update an instantiated Car object.
 * Then, using the print method that you defined, you output the given information.
 */
import java.util.Scanner;
import java.lang.Math;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Car myCar = new Car();
      
      int userYear = scnr.nextInt();
      int userPrice = scnr.nextInt();
      int userCurrentYear = scnr.nextInt();
      
      myCar.setModelYear(userYear);
      myCar.setPurchasePrice(userPrice);
      myCar.calcCurrentValue(userCurrentYear);
      
      myCar.printInfo();
   }
}
