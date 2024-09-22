package thuchanh.stratery.cc3;

import java.util.ArrayList;

public class ThanhToanOCD implements IHinhThucThanhToan{
  @Override
  public float phuongThucThanhtoan(ArrayList<MatHang> list) {
    float total = 0f;
    for(MatHang i : list){
      if(i.getDonGia()*i.getSoLuong()>2000f){
        total +=(float)(i.getDonGia()*i.getSoLuong()*2/100);
      }
    }
    return total;
  }
}
