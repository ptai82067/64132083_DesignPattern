package thuchanh.builder.a5;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Tua de 1");
    list.add("Tua de 2");
    list.add("Tua de 3");
    Book book = new Book.Builder()
            .buildTuaDe("Những người cùng khổ")
            .buildSoTrang(50)
            .builTacGia("Phạm Phước Tài")
            .buildChuong("Chuong 1 Mo dau")
            .buildChuong("Chuong 2 Lys thuyet")
            .build();
    System.out.println(book.toString());
  }
}
