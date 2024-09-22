package bt_canban.vd1;

import java.util.ArrayList;
import java.util.List;

public class QLSV implements IQLSV{
  List<SinhVienCNTT> list = new ArrayList<>();
  @Override
  public void add(SinhVienCNTT sv) {
    list.add(sv);
  }

  @Override
  public void printInfo() {
    for(var sv:list){
      System.out.printf(sv.toString());
      System.out.println();
    }
  }
}
