/**
 * A class representing a triangle, holding the attributes base and height
 * 
 */
public class Triangle {
   private double base;
   private double height;
   
   /**
    * 
    * A function that takes the userBase param and assigns that to the base variable
    * @param userBase a double representing the size of the triangle's base
    */
   public void setBase(double userBase){
      base = userBase;
   }
   
   /**
    * A function that assigns the param userHeight to the height variable
    * @param userHeight a double representing the height of the triangle
    */
   public void setHeight(double userHeight) {
      height = userHeight;
   }
   
   /**
    * This function calculates the area of the triangle using the base and height variables
    * @return a double representing the area of the triangle
    */
   public double getArea() {
      double area = 0.5 * base * height;
      return area;
   }
   
   /**
    * A function that prints the base, height, and area of the triangle
    */
   public void printInfo() {
      System.out.printf("Base: %.2f\n", base);
      System.out.printf("Height: %.2f\n", height);
      System.out.printf("Area: %.2f\n", getArea());
   }
}