package creational.factory_method.pizza;

public class VN_PizzaFactory extends PizzaStrore{
  @Override
  protected Pizza createPizza(PizzaType type) {
    switch (type){
      case MAM -> {
        return new PizzaM();
      }
      default -> {
        return new PizzaHS();
      }
    }
  }
}
