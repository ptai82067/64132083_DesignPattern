package thuchanh.stratery.cc3;

import java.util.ArrayList;

public class KhiemMaiThang11 implements IHinhThucKhienMai{
  @Override
  public float apDungKhienMai(ArrayList<MatHang> list) {
    float total = 0f;
    for(MatHang i : list){
        total +=(float)(i.getDonGia()*i.getSoLuong());
    }
    total = (float) (total *30/100);
    if (total > 2000f){
      total = 2000f;
    }
    return total;
  }
}
