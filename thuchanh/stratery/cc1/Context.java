package thuchanh.stratery.cc1;

public class Context {
  public ITinh tinhToan;

  public void setTinhToan(ITinh tinhToan) {
    this.tinhToan = tinhToan;
  }
  public float tinh(float a, float b){
    return tinhToan.tinh(a,b);
  }
}
