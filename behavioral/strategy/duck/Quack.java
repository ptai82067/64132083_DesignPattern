package behavioral.strategy.duck;

public class Quack implements IQuackBehavior{
  @Override
  public String quack() {
    return "Quác Quác Quác";
  }
}
