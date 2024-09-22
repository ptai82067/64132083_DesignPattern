package behavioral.strategy.duck;

public class VitQuayKeu implements IQuackBehavior{
  @Override
  public String quack() {
    return "1, 2, 3.... dô";
  }
}
