package thuchanh.stratery.cc2;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    QLSV qlsv = new QLSV();

    SinhVien sv3 = new SinhVien(8.99f,new Date(2004,3,24),"Lành Võ Thị");
    SinhVien sv1 = new SinhVien(8.0f,new Date(2004,10,18),"Tài Phạm Phước");
    SinhVien sv2 = new SinhVien(7.99f,new Date(2004,7,11),"Lộc Phạm Phước");
    SinhVien sv4 = new SinhVien(9.99f,new Date(2004,7,11),"Phong Phạm Phước");
    SinhVien sv5 = new SinhVien(4.99f,new Date(2004,7,11),"Phú Phạm Phước");

    qlsv.listSV.add(sv1);
    qlsv.listSV.add(sv2);
    qlsv.listSV.add(sv3);
    qlsv.listSV.add(sv4);
    qlsv.listSV.add(sv5);
    qlsv.getISoSanh(new SoSanhTheoTen());
    qlsv.sapXep();
    qlsv.inDS();

  }
}
