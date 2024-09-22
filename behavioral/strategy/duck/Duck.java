package behavioral.strategy.duck;

public abstract class Duck {
  IFlyBehavior iFlyBehavior;
  IQuackBehavior iQuackBehavior;
  public abstract void display();
  public void performFly(){
    System.out.printf(iFlyBehavior.fly());
  }
  public void performQuack(){
    System.out.printf(iQuackBehavior.quack());
  }
  public void swim(){
    System.out.printf("Swin.........\n");
  }
  public void setFlyBehavior(IFlyBehavior iFlyBehavior){
    this.iFlyBehavior = iFlyBehavior;
  }
  public void setQuackBehavior(IQuackBehavior iQuackBehavior){
    this.iQuackBehavior = iQuackBehavior;
  }
}
