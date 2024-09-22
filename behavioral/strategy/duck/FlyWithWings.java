package behavioral.strategy.duck;

public class FlyWithWings implements IFlyBehavior{
  @Override
  public String fly() {
    return "Tôi đã bay";
  }
}
