/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/21/2024
 * 
 * 10.7 LAB: Pairs (generic classes)
 * 
 * This class defines a Pair class that holds to private fields that can be set by initiating
 * an object using the constructor. Both fields are generic types that can be different types.
 * The class overrides both the toString and the compareTo methods. There is also an additional 
 * method, comparisonSymbol, that uses the other methods.
 */

public class Pair <TheType extends Comparable<TheType>> {
   private TheType firstVal;
   private TheType secondVal;

   /* Type the code for The constructor here. */
   /**
    * A constructor to instantiate an object of type Pair
    * @param aVal first value
    * @param bVal second value
    */
   public Pair(TheType aVal, TheType bVal) {
	   firstVal = aVal;
	   secondVal = bVal;
   }


   
   
   /**
    * returns a string consisting of both fields in brackets
    */
   public String toString() {
	   String str = "[" + firstVal + ", " + secondVal + "]";	
	   return str;
   }

   
   
   // Implement Comparable's expected compareTo()
   /**
    * overrides the compareto method that compairs Pair types
    * @param otherPair the other pair to be compared with
    * @return a value representing the comparison of the 2 object
    */
   public int compareTo(Pair<TheType> otherPair) {
      /* Type your code here. */
	  int comparison = firstVal.compareTo(otherPair.firstVal);
	  if (comparison == 0) {
		  return secondVal.compareTo(otherPair.secondVal);
	  }
	  else {
		  return comparison;
	  }
   }

   
   
   // Return '<', '=', or '>' according to the ordering of this pair and otherPair
   /**
    * This method uses the compareTo method to return a character representing the comparison
    * between the two objects
    * @param otherPair the other pair being compared to
    * @return the character representin the comparison
    */
   public char comparisonSymbol(Pair<TheType> otherPair) {
	   
     if (this.compareTo(otherPair) > 0) {
    	 return '>';
     }
     else if (this.compareTo(otherPair) == 0) {
    	 return '=';
     }
     else {
    	 return '<';
     }
   }

}
