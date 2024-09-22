package bt_canban.vd1;

public class SinhVienCNTT {
  String ten;
  String queQuan;
  int tuoi;

  public SinhVienCNTT(String ten, String queQuan, int tuoi) {
    this.ten = ten;
    this.queQuan = queQuan;
    this.tuoi = tuoi;
  }

  @Override
  public String toString() {
    return "Tên: " + this.ten + "\n"
            + "Quên Quán: " + this.queQuan + "\n"
            + "Tuổi: " + this.tuoi + "\n";
  }

  public String getTen() {
    return ten;
  }

  public String getQueQuan() {
    return queQuan;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public void setQueQuan(String queQuan) {
    this.queQuan = queQuan;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
}
