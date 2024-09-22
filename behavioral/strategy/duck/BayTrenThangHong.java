package behavioral.strategy.duck;

public class BayTrenThangHong implements IFlyBehavior{
  @Override
  public String fly() {
    return "Quay đều, Quay đều, Quay đều... Vàng đều";
  }
}
