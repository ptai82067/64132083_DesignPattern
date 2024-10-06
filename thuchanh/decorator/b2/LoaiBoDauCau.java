package thuchanh.decorator.b2;

import java.util.ArrayList;

public class LoaiBoDauCau extends Decorator{
  public LoaiBoDauCau(XuLyChuoi xuLyChuoi) {
    super(xuLyChuoi);
  }
  @Override
  ArrayList<String> tachChuoi(){
    ArrayList<String> temp = xuLyChuoi.tachChuoi();
    temp.removeIf(i -> i.equals(".") || i.equals(","));
    return temp;
  }
}
