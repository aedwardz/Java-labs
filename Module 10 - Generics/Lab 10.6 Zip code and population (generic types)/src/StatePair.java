/*
 * Antonio Edwards 
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/20/2024
 * 
 * Lab 10.6: Zip code and population (generic types)
 * 
 * This class declares two generic data types as fields that are used in its constructor. These fields
 * can not only be defined as two seperate types that extend the Comparable class, but they
 * each have accessor and mutator methods associated with them. Additionally, the class defines a 
 * printInfo method that prints the two values seperated by a colon
 */

public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
   private Type1 value1;
   private Type2 value2;
   
   // TODO: Define a constructor, mutators, and accessors 
   
   
   
   
   /**
    * 
    * @param val1 sets value1
    * @param val2 sets value2
    */
   public StatePair(Type1 val1, Type2 val2) {
	   value1 = val1;
	   value2 = val2;
   }
   
   
   
   
   /**
    * 
    * @param val1 value to be set
    */
   public void setValue1(Type1 val1) {
	   value1 = val1;
   }
   
   
   
   
   /**
    * 
    * @param val2 value to be set
    */
   public void setValue2(Type2 val2) {
	   value2 = val2;
   }
   
   
   
   
   /**
    * 
    * @return value1
    */
   public Type1 getValue1() {
	   return value1;
   }
   
   /**
    * 
    * @return value2
    */
   public Type2 getValue2() {
	   return value2;
   }
   
   /**
    * Prints out value1 and value2
    */
   public void printInfo() {
	   System.out.printf("%s: %s\n", value1, value2);
	   
   }
} 
 