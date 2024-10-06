package thuchanh.decorator.b1;

public class BieuThucDecorator extends BieuThuc{
  protected BieuThuc bieuThuc;

  public BieuThucDecorator(BieuThuc bieuThuc) {
    this.bieuThuc = bieuThuc;
  }

  @Override
  public float giaTri() {
    return bieuThuc.giaTri();
  }

  @Override
  public String bieuThuc() {
    return bieuThuc.bieuThuc();
  }
}
