import java.util.ArrayList;

public class CallEmployee {
   public static void main(String[] args) {
      Employee person1;
      Salesperson person2;
      Designer person3;

      ArrayList<Employee> personList = new ArrayList<Employee>();
      int i;

      person1 = new Employee();
      person1.setName("Mia");

      person2 = new Salesperson();
      person2.setName("Aja");
      person2.setProduct("insurance");

      person3 = new Designer();
      person3.setName("Liam");
      person3.setObject("cars");

      personList.add(person1);
      personList.add(person3);
      personList.add(person2);

      for(i = 0; i < personList.size(); ++i){
         personList.get(i).printInfo();
      }
   }
}