package classes_objects;

/*Class: A blueprint for creating objects.
  Object: Instance created using the class. */

public class Hotel {

  int coffee = 20;
  int tea = 15;
  int milo = 25;

  public static void main(String[] args) {
    Hotel server1 = new Hotel();

    System.out.println(server1.coffee);

  }
}