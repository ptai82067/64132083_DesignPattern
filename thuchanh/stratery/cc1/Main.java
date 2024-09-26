package thuchanh.stratery.cc1;

public class Main {
  public static void main(String[] args) {
    Context pt1 = new Context();
    pt1.setTinhToan(new Chia());
    System.out.println("\npt1.tinh(1f,3.5f) = " + pt1.tinh(1f,0f));
    
  }
}
