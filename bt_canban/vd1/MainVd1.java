package bt_canban.vd1;

public class MainVd1 {
  public static void main(String[] args) {
//    SinhVienCNTT sv = new SinhVienCNTT("Phạm Phước Tài","Phú Yên",21);
//    SinhVienCNTT sv1 = new SinhVienCNTT("Phạm Phước Lộc","Phú Yên",40);
//    System.out.printf(sv.toString());
//    System.out.printf(sv1.toString());
//    var sv2 = new SinhVienCNTT_CLC("Bảo", "Khánh Hòa", 20, "x2");
//    System.out.printf(sv2.toString());
    var qlsv = new QLSV();
    qlsv.add(new SinhVienCNTT("Phạm Phước Tài","Phú Yên",21));
    qlsv.add(new SinhVienCNTT("Phạm Phước Lộc","Phú Yên",40));
    qlsv.add(new SinhVienCNTT_CLC("Bảo", "Khánh Hòa", 20, "x2"));
    qlsv.add(new SinhVienCNTT_CLC("Hong", "Khánh Hòa", 20, "x3"));
    qlsv.printInfo();
  }
}
