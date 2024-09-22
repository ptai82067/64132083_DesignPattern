package behavioral.strategy.duck;

public class Apps {
  public static void main(String[] args) {
    Duck duck = new VitQuay();
    duck.setFlyBehavior(new BayTrenThangHong());
    duck.setQuackBehavior(new VitQuayKeu());
    duck.display();
    Duck vitluoc = new VitLuoc();
    vitluoc.setFlyBehavior(new BayTrongNoi());
    vitluoc.setQuackBehavior(new ViLuocKeu());
    vitluoc.display();
  }
}
