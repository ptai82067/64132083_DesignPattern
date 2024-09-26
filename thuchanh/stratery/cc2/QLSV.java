package thuchanh.stratery.cc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QLSV {
  public ISoSanh<SinhVien> iSoSanh;
  public Comparator<SinhVien> comparator;
  ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();

  public void getISoSanh(ISoSanh<SinhVien> iSoSanh){
    this.iSoSanh = iSoSanh;
  }

  public void sapXep(){
//    Collections.sort(listSV, new Comparator<SinhVien>() {
//      @Override
//      public int compare(SinhVien o1, SinhVien o2) {
//        return iSoSanh.soSanh(o1, o2);
//      }
//    });
    listSV.sort((o1, o2) -> iSoSanh.soSanh(o1,o2));
  }
  public void sapXep2(){
    for(int i = 0; i < listSV.size()-1; i++){
      for(int j = i+1; j< listSV.size(); i++){
        if (iSoSanh.soSanh(listSV.get(i),listSV.get(j)) == 1){
          var s = listSV.get(i);
          listSV.set(i,listSV.get(j));
          listSV.set(j,s);
        }
      }
    }
  }
  public void sapXep3(){
    listSV.sort(comparator);
  }



  public void inDS(){
    for(SinhVien i : listSV){
      System.out.printf("Họ và tên sinh viên: "+i.getHoTen()+"\n" +
              "Ngày sinh : "+i.getNgaySinh()+"\n" +
              "Điểm số trung bình của "+i.getHoTen()+": "+ i.getDiemTB()+"\n");
    }
  }

  public void setComparator(Comparator<SinhVien> comparator) {
    this.comparator = comparator;
  }
}
