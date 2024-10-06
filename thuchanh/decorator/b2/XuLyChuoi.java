package thuchanh.decorator.b2;

import java.util.ArrayList;

public abstract class XuLyChuoi {
  protected String str;
  protected ArrayList<String> dsTu;

  abstract ArrayList<String> tachChuoi();
  public void hienThi(){
    dsTu = tachChuoi();
    for (var i : dsTu){
      if (i.equals(" ")){

        continue;
      }
      System.out.printf("["+i+"]   ");
    }
  }

}
