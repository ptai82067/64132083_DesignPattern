package creational.factory_method.pizza;

public class PizzaHS extends Pizza{
  @Override
  protected void prepare() {
    pizza.append("Chuẩn bị 4 con cá cơm, khung làm bánh, bột");
  }

  @Override
  protected void bake() {
  pizza.append("Nhào bột, rắt cá");
  }

  @Override
  protected void cut() {
    pizza.append("Cắt làm 4");
  }

  @Override
  protected void box() {
    pizza.append("đóng hộp");
  }
}
