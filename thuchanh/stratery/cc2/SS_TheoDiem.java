package thuchanh.stratery.cc2;

import java.util.Comparator;

public class SS_TheoDiem implements Comparator<SinhVien> {
  @Override
  public int compare(SinhVien o1, SinhVien o2) {
    int compare =  o1.getHoTen().compareTo(o2.getHoTen());
    if(compare >0){
      return 1;
    } else if (compare<0) {
      return -1;
    }else {
      return 0;
    }
  }
}
