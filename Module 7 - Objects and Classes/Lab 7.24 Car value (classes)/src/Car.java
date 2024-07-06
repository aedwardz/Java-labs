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

public class Car {
   private int modelYear; 

   private int purchasePrice;

   private int currentValue;
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   
   
   
   /**
    * This function assigns the price param to the purchasePrice variable
    * 
    * @param price integer representing the purchase price of the car
    */
   public void setPurchasePrice(int price) {
	   purchasePrice = price;
   }

   
   
   /**
    * Returns the purchase Price of the car
    * 
    * @return int purchasePrice
    */
   public int getPurchasePrice() {
	   return purchasePrice;
   }
   
  
   
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   
  
   /**
    * This function prints out the information of the car in a specially
    * formatted way
    */
   public void printInfo() {
	   System.out.println("Car's information:");
	   System.out.println("  Model year: " + modelYear);
	   System.out.println("  Purchase price: $" + purchasePrice);
	   System.out.println("  Current value: $" + currentValue);
   }
}