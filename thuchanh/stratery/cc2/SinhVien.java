package thuchanh.stratery.cc2;

import java.util.Date;

public class SinhVien {
  private String hoTen;
  private Date ngaySinh;
  private float diemTB;

  public SinhVien() {
  }

  public SinhVien(float diemTB, Date ngaySinh, String hoTen) {
    this.diemTB = diemTB;
    this.ngaySinh = ngaySinh;
    this.hoTen = hoTen;
  }

  public Date getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(Date ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public float getDiemTB() {
    return diemTB;
  }

  public void setDiemTB(float diemTB) {
    this.diemTB = diemTB;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }
}
