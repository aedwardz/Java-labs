public class TestAnimal {
   public static void main(String[] args) {
      Domestic myDomestic = new Domestic("Blue", 2, "Paula");
      Wild myWild = new Wild("Baloo", 3, "Bear");

      myDomestic.printInfo();
      System.out.println();
      myWild.printInfo();
   }
}