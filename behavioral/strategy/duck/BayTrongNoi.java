package behavioral.strategy.duck;

public class BayTrongNoi implements IFlyBehavior{
  @Override
  public String fly() {
    return "Nằm im trong nồi \n";
  }
}
