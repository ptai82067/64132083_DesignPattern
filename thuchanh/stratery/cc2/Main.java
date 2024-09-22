package thuchanh.stratery.cc2;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    QLSV qlsv = new QLSV();

    SinhVien sv3 = new SinhVien(8.99f,new Date(2004,3,24),"Võ Thị Lành");
    SinhVien sv1 = new SinhVien(8.0f,new Date(2004,10,18),"Phạm Phước Tài");
    SinhVien sv2 = new SinhVien(7.99f,new Date(2004,7,11),"Phạm Phước Lộc");

    qlsv.listSV.add(sv1);
    qlsv.listSV.add(sv2);
    qlsv.listSV.add(sv3);
    qlsv.getISoSanh(new SoSanhTheoDiem());
    qlsv.sapXep();
    qlsv.inDS();
    qlsv.getISoSanh(new SoSanhTheoTen());
    qlsv.sapXep();
    qlsv.inDS();
  }
}
