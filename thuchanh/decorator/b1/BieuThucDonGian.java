package thuchanh.decorator.b1;

public class BieuThucDonGian extends BieuThuc{
  private float toanHang;

  public BieuThucDonGian(float toanHang) {
    this.toanHang = toanHang;
  }

  @Override
  public float giaTri() {
    return toanHang;
  }

  @Override
  public String bieuThuc() {
    return toanHang+"";
  }
}
