package thuchanh.builder.a5;

import java.util.ArrayList;
import java.util.List;

public class Book {
  String tuaDe;
  int soTrang;
  String tacGia;
  List<String> chuonng;
  private Book(Builder b){
    this.tuaDe = b.tuaDe;
    this.soTrang = b.soTrang;
    this.tacGia = b.tacGia;
    chuonng = b.chuonng;
  }

  @Override
  public String toString() {
    return "Book{" +
            "tuaDe='" + tuaDe + '\'' +
            ", soTrang=" + soTrang +
            ", tacGia='" + tacGia + '\'' +
            ", chuonng=" + chuonng +
            '}';
  }
  public static class Builder{
    String tuaDe;
    int soTrang;
    String tacGia;
    List<String> chuonng = new ArrayList<>();
    Builder buildTuaDe(String tuaDe){
      this.tuaDe = tuaDe;
      return this;
    }
    Builder buildSoTrang(int soTrang){
      this.soTrang = soTrang;
      return this;
    }
    Builder builTacGia(String tacGia){
      this.tacGia = tacGia;
      return this;
    }
    Builder buildChuong(String chuong){
      this.chuonng.add(chuong);
      return this;
    }
    Book build(){
      return new Book(this);
    }
  }
}
