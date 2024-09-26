package creational.factory_method.pizza;

public class Main {
  public static void main(String[] args) {
    PizzaStrore pz = new VN_PizzaFactory();
    Pizza p = pz.orderPizza(PizzaType.HAI_SAN);
    System.out.println(p.toString());
  }
}
