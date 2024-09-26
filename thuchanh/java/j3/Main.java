package thuchanh.java.j3;

public class Main {
  public static void main(String[] args) {
    SinhVienNTU sv = new SinhVienIT("Phạm Phước Tài","Công Nghê Thông Tin",7.0f,7.9f,8.3f);
    SinhVienIT sv1 = new SinhVienIT("Phạm Phước Lộc","Công Nghê Thông Tin",6.0f,5.0f,7.0f);
    SinhVienNTU sv2 = new SinhVienIT("Võ Thị Lành","MarKetTing",7.0f,7.9f,8.3f);
    sv.inThongTin();
    sv1.inThongTin();
    sv2.inThongTin();
  }
}
