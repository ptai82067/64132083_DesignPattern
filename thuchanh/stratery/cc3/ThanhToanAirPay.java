package thuchanh.stratery.cc3;

import java.util.ArrayList;

public class ThanhToanAirPay implements IHinhThucThanhToan{
  @Override
  public float phuongThucThanhtoan(ArrayList<MatHang> list) {
    float total = 0f;
    for(MatHang i : list){
      if(i.getDonGia()*i.getSoLuong()>1000f){
        total +=(float)(i.getDonGia()*i.getSoLuong()*3/100);
      }
    }
    return total;
  }
}
