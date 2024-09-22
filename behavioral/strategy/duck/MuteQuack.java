package behavioral.strategy.duck;

public class MuteQuack implements IQuackBehavior{
  @Override
  public String quack() {
    return "......................";
  }
}
