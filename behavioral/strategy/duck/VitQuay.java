package behavioral.strategy.duck;

public class VitQuay extends Duck{

  @Override
  public void display() {
    System.out.printf("Vit quay Bắc Kinh");
    this.performFly();
    this.swim();
    this.performQuack();

  }

}
