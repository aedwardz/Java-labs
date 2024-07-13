/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/12/2024
 * 
 * Lab 8.19: Plant Information
 * 
 * This program takes multiple lines of input until a -1 is given. The program checks the first word of each line
 * to check weather it is "flower" or "plant". Based on these inputs, it creates a class object for each respective 
 * word, using the words on the rest of the line to set the fields of said objects. After adding these objects to an
 * ArrayList, it demonstrates polymorphism by calling the same method on each class object in the list.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

	
	/**
	 * This method iterates throught the arraylist parameter and calls printInfo on each object held
	 * inside of it
	 * @param arr an Array list of Plant objects
	 */
	public static void printArrayList(ArrayList<Plant> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.printf("Plant %d Information: \n", i+1);
			arr.get(i).printInfo();
			System.out.println();
		}
	}
	
	
	
	
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<Plant>();

      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      String plantName;
      String plantCost;
      String flowerName;
      String flowerCost;
      String colorOfFlowers;
      boolean isAnnual;
      
      
      
      input = scnr.next();
      while(!input.equals("-1")){
    	  if (input.equals("plant")) {
    		  Plant plant = new Plant();
    		  plantName = scnr.next();
    		  plantCost = scnr.next();
    		  plant.setPlantName(plantName);
    		  plant.setPlantCost(plantCost);
    		  myGarden.add(plant);
    	  }
    	  else if (input.equals("flower")){
    		  Flower flower = new Flower();
    		  flowerName = scnr.next();
    		  flowerCost = scnr.next();
    		  isAnnual = scnr.nextBoolean();
    		  colorOfFlowers = scnr.next();
    		  
    		  flower.setColorOfFlowers(colorOfFlowers);
    		  flower.setPlantCost(flowerCost);
    		  flower.setPlantName(flowerName);
    		  flower.setPlantType(isAnnual);
    		  
    		  myGarden.add(flower);
    	  }
      
         input = scnr.next();
      }
      
      printArrayList(myGarden);
      
      
   }
}
