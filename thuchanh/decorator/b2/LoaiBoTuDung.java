package thuchanh.decorator.b2;

import java.util.ArrayList;
import java.util.Arrays;

public class LoaiBoTuDung extends Decorator{
  public LoaiBoTuDung(XuLyChuoi xuLyChuoi) {
    super(xuLyChuoi);
  }
  @Override
  public ArrayList<String> tachChuoi(){
    ArrayList<String> temp = xuLyChuoi.tachChuoi();
    temp.removeIf(i -> i.equalsIgnoreCase("và")||i.equalsIgnoreCase("hoặc")
    ||i.equalsIgnoreCase("thì")||i.equalsIgnoreCase("là")||
            i.equalsIgnoreCase("mà"));
    return temp;
  }
}
