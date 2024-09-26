package creational.factory_method.pizza;

public class PizzaM extends Pizza{
  @Override
  protected void prepare() {
    pizza.append("Chuẩn bị mắm, bột, khuôn đúc\n");
  }

  @Override
  protected void bake() {
   pizza.append("nhào bột, giã mắm\n");
  }

  @Override
  protected void cut() {
    pizza.append("Cắt ra 8 phần\n");
  }

  @Override
  protected void box() {
    pizza.append("Nhào hộp\n");
  }
}
