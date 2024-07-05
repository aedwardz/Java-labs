/*
 * Antonio Edwards
 * CIS 255 Summer 2024
 * Instructor Dave Harden
 * 7/5/2024
 * 
 * Lab 7.23: Triangle area comparision
 * 
 * This program takes in 4 inputs. Each being a double, the variables represent the heights and
 * bases of two previously declared triangle objects. After assigning these values to their 
 * respective triangles, a triangle's information is output if it has the smaller area
 */

import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());

      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());
      
      System.out.println("Triangle with smaller area:");
   
      if (triangle1.getArea() < triangle2.getArea()) {
    	  triangle1.printInfo();
      }
      else {
    	  triangle2.printInfo();
      }
      
   }
}
