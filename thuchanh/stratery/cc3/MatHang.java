package thuchanh.stratery.cc3;

public class MatHang {
  private String tenMatHang;
  private int soLuong;
  private long donGia;

  public MatHang() {
  }

  public MatHang(String tenMatHang, int soLuong, long donGia) {
    this.tenMatHang = tenMatHang;
    this.soLuong = soLuong;
    this.donGia = donGia;
  }

  public String getTenMatHang() {
    return tenMatHang;
  }

  public void setTenMatHang(String tenMatHang) {
    this.tenMatHang = tenMatHang;
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

  public void setDonGia(long donGia) {
    this.donGia = donGia;
  }
}
