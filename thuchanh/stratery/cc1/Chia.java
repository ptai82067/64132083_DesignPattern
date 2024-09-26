package thuchanh.stratery.cc1;

public class Chia implements ITinh{
  @Override
  public float tinh(float a, float b) {
    if (b==0) {
      System.out.printf("Không thể chia cho 0");
      return Float.NaN;
    }
    return a/b;
  }
}
