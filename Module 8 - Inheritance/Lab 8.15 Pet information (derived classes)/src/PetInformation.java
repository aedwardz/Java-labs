/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/8/2024
 * 
 * Lab 8.15: Pet Information (derived classes)
 * 
 * This program takes in four lines of input and uses them as fields for the Pet
 * and Cat classes. Since Cat is a derived class of the Pet class, it uses the Pet object
 * methods to set name and age, then additionally breed. The Pet object sets its name and age.
 * Each object then prints to output the values of their fields.
 * 
 */
import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Cat myCat = new Cat();
      
      String petName, catName, catBreed;
      int petAge, catAge;

      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      scnr.nextLine();
      catBreed = scnr.nextLine();
      
      // TODO: Create generic pet (using petName, petAge) and then call printInfo  
      myPet.setAge(petAge);
      myPet.setName(petName);
      myPet.printInfo();
      // TODO: Create cat pet (using catName, catAge, catBreed) and then call printInfo
      myCat.setAge(catAge);
      myCat.setName(catName);
      myCat.setBreed(catBreed);
      myCat.printInfo();
      // TODO: Use getBreed(), to output the breed of the cat
      System.out.println("   Breed: " + myCat.getBreed());
      
   }
}