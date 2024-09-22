package thuchanh.stratery.cc3;

public class Main {
  public static void main(String[] args) {
    MatHang mh1 = new MatHang("Laptop Lenovo",1,9000);
    MatHang mh2 = new MatHang("Laptop Dell",1,8000);
    MatHang mh3 = new MatHang("Điện Thoại SamSung",3,3000);
    GioHang gh = new GioHang();
    gh.listMatHang.add(mh1);
    gh.listMatHang.add(mh2);
    gh.listMatHang.add(mh3);
    gh.setiHinhThucThanhToan(new ThanhToanOCD());
    gh.setiHinhThucKhienMai(new KhiemMaiThang11());
    System.out.printf("Số tiền cần thanh toán: "+ gh.thanhToan());

  }
}
