package thuchanh.java.j3;

public class SinhVienIT extends SinhVienNTU{
  private float diemJava;
  private float diemCSS;
  private float diemHTML;

  public SinhVienIT(String hoTen, String ngang, float diemCSS, float diemJava, float diemHTML) {
    super(hoTen, ngang);
    this.diemCSS = diemCSS;
    this.diemJava = diemJava;
    this.diemHTML = diemHTML;
  }

  public float getDiemJava() {
    return diemJava;
  }

  public void setDiemJava(float diemJava) {
    this.diemJava = diemJava;
  }

  public float getDiemCSS() {
    return diemCSS;
  }

  public void setDiemCSS(float diemCSS) {
    this.diemCSS = diemCSS;
  }

  public float getDiemHTML() {
    return diemHTML;
  }

  public void setDiemHTML(float diemHTML) {
    this.diemHTML = diemHTML;
  }


  @Override
  public float getDiemTB() {
    return  (getDiemJava()*2 + getDiemCSS() + getDiemHTML())/4.0f;
  }




}
