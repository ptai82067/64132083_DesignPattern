package thuchanh.decorator.b1;

public class Chia extends BieuThucDecorator{
  private float toanHang;

  public Chia(BieuThuc bieuThuc, float toanHang) {
    super(bieuThuc);
    this.toanHang = toanHang;
  }

  @Override
  public float giaTri(){
    return bieuThuc.giaTri()/toanHang;
  }
  @Override
  public String bieuThuc(){
    return bieuThuc.bieuThuc() + "/" + toanHang;
  }
}
