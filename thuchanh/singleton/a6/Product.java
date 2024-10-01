package thuchanh.singleton.a6;

public class Product {
  private String maSanPham, tenSanPham;
  private int soLuong;
  private float donGia;

  public Product() {
  }

  public Product(String maSanPham, String tenSanPham, int soLuong, float donGia) {
    this.maSanPham = maSanPham;
    this.tenSanPham = tenSanPham;
    this.soLuong = soLuong;
    this.donGia = donGia;
  }

  public String getMaSanPham() {
    return maSanPham;
  }

  public void setMaSanPham(String maSanPham) {
    this.maSanPham = maSanPham;
  }

  public String getTenSanPham() {
    return tenSanPham;
  }

  public void setTenSanPham(String tenSanPham) {
    this.tenSanPham = tenSanPham;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(int soLuong) {
    this.soLuong = soLuong;
  }

  public float getDonGia() {
    return donGia;
  }

  public void setDonGia(float donGia) {
    this.donGia = donGia;
  }
}
