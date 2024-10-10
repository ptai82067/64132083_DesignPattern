package thuchanh.decorator.b2;

public class Main {
  public static void main(String[] args) {
    XuLyChuoi xuLyChuoi = new Tokenize();
    xuLyChuoi.str = "Xin chào thì tôi đang học Java. Và Đây là một ví dụ, nó là một abxccc";

    System.out.println("----------------");
    xuLyChuoi = new LoaiBoDauCau(xuLyChuoi);
    xuLyChuoi = new LoaiBoTuDung(xuLyChuoi);
    xuLyChuoi.hienThi();
  }
}
