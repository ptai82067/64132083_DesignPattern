package thuchanh.stratery.cc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QLSV {
  public ISoSanh iSoSanh;
  ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
  public void getISoSanh(ISoSanh iSoSanh){
    this.iSoSanh = iSoSanh;
  }
  public void sapXep(){
    Collections.sort(listSV, new Comparator<SinhVien>() {
      @Override
      public int compare(SinhVien o1, SinhVien o2) {
        return iSoSanh.soSanh(o1, o2);
      }
    });
  }
  public void inDS(){
    for(SinhVien i : listSV){
      System.out.printf("Họ và tên sinh viên: "+i.getHoTen()+"\n" +
              "Điểm số trung bình của "+i.getHoTen()+": "+ i.getDiemTB()+"\n");
    }
  }
}
