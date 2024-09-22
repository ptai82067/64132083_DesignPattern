package behavioral.strategy.duck;

public class FlyNoWay implements IFlyBehavior{
  @Override
  public String fly() {
    return "Tôi không thể bay";
  }
}
