package thuchanh.stratery.cc3;

import java.util.ArrayList;

public class GioHang {
  IHinhThucThanhToan iHinhThucThanhToan;
  IHinhThucKhienMai iHinhThucKhienMai;
  ArrayList<MatHang> listMatHang = new ArrayList<>();
  public void setiHinhThucThanhToan(IHinhThucThanhToan iHinhThucThanhToan){
    this.iHinhThucThanhToan = iHinhThucThanhToan;
  }
  public void setiHinhThucKhienMai(IHinhThucKhienMai iHinhThucKhienMai){
    this.iHinhThucKhienMai = iHinhThucKhienMai;
  }
  public float tongDonHang(ArrayList<MatHang> list){
    float total = 0f;
    System.out.println("******** Chi Tiết Hóa Đơn ********");
    for (MatHang i : list){
      total +=(float)i.getDonGia()*i.getSoLuong();
      System.out.println(i.getTenMatHang()+"----"+i.getDonGia()+"----"+i.getSoLuong());
    }
    return total;
  }
  public float thanhToan(){
      float total = 0f;
      total += tongDonHang(listMatHang);
      total -= iHinhThucThanhToan.phuongThucThanhtoan(listMatHang);
      total -= iHinhThucKhienMai.apDungKhienMai(listMatHang);

    System.out.printf("---------------------------------------------------------------\n");
    System.out.println("Số tiền giảm sau khi áp dụng phương thức thanh toán: "+
            iHinhThucThanhToan.phuongThucThanhtoan(listMatHang));
    System.out.println("Số tiền giảm sau khi áp dụng hình thức khiến mãi: "+
            iHinhThucKhienMai.apDungKhienMai(listMatHang));
    return total;
  }
}
