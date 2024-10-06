package thuchanh.decorator.b1;

public class Main {
  public static void main(String[] args) {
    BieuThuc tinhToan = new BieuThucDonGian(6f);
    tinhToan = new Cong(tinhToan,9f);
    tinhToan = new Nhan(tinhToan,8f);
    tinhToan = new Cong(tinhToan,5f);
    System.out.println("Giá trị hiện tại: "+tinhToan.giaTri());
    System.out.println("Biểu thức hiện tại: "+tinhToan.bieuThuc());
    System.out.println("-------------------------------------------");
    BieuThuc tinhToan2 = new BieuThucDonGian(8f);
    tinhToan2 = new Cong(tinhToan2,6f);
    tinhToan2 = new Chia(tinhToan2,2f);
    tinhToan2 = new Nhan(tinhToan2,5f);
    tinhToan2 = new Cong(tinhToan2,8f);
    tinhToan2 = new Tru(tinhToan2,4f);
    System.out.println("Giá trị hiện tại: "+tinhToan2.giaTri());
    System.out.println("Biểu thức hiện tại: "+tinhToan2.bieuThuc());
  }
}
