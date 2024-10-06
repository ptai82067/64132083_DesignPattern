package thuchanh.decorator.b2;

import java.util.ArrayList;

public class Decorator extends XuLyChuoi{
  protected XuLyChuoi xuLyChuoi;

  public Decorator(XuLyChuoi xuLyChuoi) {
    this.xuLyChuoi = xuLyChuoi;
  }

  @Override
  ArrayList<String> tachChuoi() {
    return xuLyChuoi.tachChuoi();
  }
}
