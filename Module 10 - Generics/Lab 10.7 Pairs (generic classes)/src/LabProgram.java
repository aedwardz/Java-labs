/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/21/2024
 * 
 * 10.7 LAB: Pairs (generic classes)
 * 
 * This program fills 3 pairs of Pair objects with values. Using the comparison methods
 * of the Pair class, the output is the result of the comparison between each pair
 */
import java.util.Scanner;

public class LabProgram {
   public static Pair<Integer> readIntegerPair(Scanner scnr) {
      /* Type your code here. */
	   int val1 = scnr.nextInt();
	   int val2 = scnr.nextInt();
	   
	   return new Pair<Integer>(val1, val2);
   }

   public static Pair<Double> readDoublePair(Scanner scnr) {
      /* Type your code here. */
	   double val1 = scnr.nextDouble();
	   double val2 = scnr.nextDouble();
	   
	   return new Pair<Double>(val1, val2);
   }

   public static Pair<String> readWordPair(Scanner scnr) {
      /* Type your code here. */
	   String val1 = scnr.next();
	   String val2 = scnr.next();
	   
	   return new Pair<String>(val1, val2);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pair<Integer> integerPair1 = readIntegerPair(scnr);
      Pair<Integer> integerPair2 = readIntegerPair(scnr);

      Pair<Double> doublePair1 = readDoublePair(scnr);
      Pair<Double> doublePair2 = readDoublePair(scnr);

      Pair<String> wordPair1 = readWordPair(scnr);
      Pair<String> wordPair2 = readWordPair(scnr);

      /* Type the code for output here. */
      
      System.out.printf("%s %c %s\n", integerPair1, integerPair1.comparisonSymbol(integerPair2), integerPair2);
      System.out.printf("%s %c %s\n", doublePair1, doublePair1.comparisonSymbol(doublePair2), doublePair2);
      System.out.printf("%s %c %s\n", wordPair1, wordPair1.comparisonSymbol(wordPair2), wordPair2);

}}
