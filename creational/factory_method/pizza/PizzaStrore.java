package creational.factory_method.pizza;

public abstract class PizzaStrore {
  protected abstract Pizza createPizza(PizzaType type);
  public Pizza orderPizza(PizzaType type){
    Pizza pz = createPizza(type);
    pz.prepare();
    pz.bake();
    pz.cut();
    pz.box();
    return pz;
  }
}
