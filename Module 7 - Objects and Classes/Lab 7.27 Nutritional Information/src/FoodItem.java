/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/7/2024
 * Lab 7.27: Nutritional Information (classes/constructors)
 * 
 * This FoodItem class represents a food and all of its attributes. It has two constructors. 
 * One of them being the default constructor and the other setting each of its params to their
 * respective fields. This is done by utilizing method overloading
 */

public class FoodItem {
   private String name;
   private double fat;
   private double carbs;
   private double protein;
   
   // TODO: Define default constructor
   /**
    * default constructor. Sets name as "water" and everything else as 0.0
    */
   public FoodItem() {
	   name = "Water";
	   fat = 0.0;
	   carbs = 0.0;
	   protein = 0.0;
   }
   
   
   
   
   
   // TODO: Define second constructor with parameters to initialize private fields (name, fat, carbs, protein)
   /**
    * Sets each of the params with their respective fields
    * @param name
    * @param fat
    * @param carbs
    * @param protein
    */
   public FoodItem(String name, double fat, double carbs, double protein) {
	   this.name = name;
	   this.carbs = carbs;
	   this.fat = fat;
	   this.protein = protein;
   }
   
   
   
   
   
   
   public String getName() {
      return name;
   }
   
   public double getFat() {
      return fat;
   }
   
   public double getCarbs() {
      return carbs;
   }
   
   public double getProtein() {
      return protein;
   }
   
   public double getCalories(double numServings) {
      // Calorie formula
      double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
      return calories;
   }
   
   public void printInfo() {
      System.out.println("Nutritional information per serving of " + name + ":");
      System.out.printf("  Fat: %.2f g\n", fat);
      System.out.printf("  Carbohydrates: %.2f g\n", carbs);
      System.out.printf("  Protein: %.2f g\n", protein);
   }
}