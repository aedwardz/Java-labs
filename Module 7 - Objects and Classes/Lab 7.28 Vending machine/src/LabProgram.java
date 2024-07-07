/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/7/2024
 * Lab 7.27: Nutritional Information (classes/constructors)
 * 
 * This program takes two inputs. The first input represents the number of drinks to be purchased and the other
 * represents the number of bottles to restock. Using a VendingMachine object, It calls its methods purchase and restock
 * to set those fields to represent that goal. Finally, It calls report to show the inventory of the vending machine.
 */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int numDrinks = scnr.nextInt();
      int bottles = scnr.nextInt();
      
      VendingMachine vendingMachine = new VendingMachine();
      
      vendingMachine.purchase(numDrinks);
      vendingMachine.restock(bottles);
      
      vendingMachine.report();
      
      
   }
}