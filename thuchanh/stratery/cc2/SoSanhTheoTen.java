package thuchanh.stratery.cc2;

public class SoSanhTheoTen implements ISoSanh{
  @Override
  public int soSanh(SinhVien o1, SinhVien o2) {
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
