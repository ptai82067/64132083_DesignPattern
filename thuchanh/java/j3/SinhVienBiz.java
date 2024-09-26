package thuchanh.java.j3;

public class SinhVienBiz extends SinhVienNTU{
  private float diemMarketing;
  private float diemSales;

  public SinhVienBiz(String hoTen, String ngang, float diemMarketing, float diemSales) {
    super(hoTen, ngang);
    this.diemMarketing = diemMarketing;
    this.diemSales = diemSales;
  }

  public float getDiemMarketing() {
    return diemMarketing;
  }

  public void setDiemMarketing(float diemMarketing) {
    this.diemMarketing = diemMarketing;
  }

  public float getDiemSales() {
    return diemSales;
  }

  public void setDiemSales(float diemSales) {
    this.diemSales = diemSales;
  }


  @Override
  public float getDiemTB() {
    return (getDiemMarketing()*2 + getDiemSales())/3.0f;
  }

}
