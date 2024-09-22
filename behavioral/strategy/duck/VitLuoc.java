package behavioral.strategy.duck;

public class VitLuoc extends Duck{
  @Override
  public void display() {
    System.out.printf("Chuẩn bị nước sôi\n");
    this.performFly();
    this.swim();
    this.performQuack();
  }
}
