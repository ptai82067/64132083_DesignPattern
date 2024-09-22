package bt_canban.vd1;

public class SinhVienCNTT_CLC extends SinhVienCNTT{
  private String hocPhi;

  public SinhVienCNTT_CLC(String ten, String queQuan, int tuoi, String hocPhi) {
    super(ten, queQuan, tuoi);
    this.hocPhi = hocPhi;
  }

  @Override
  public String toString() {
    return super.toString() +
            "Học phí" + this.hocPhi;
  }

  public String getHocPhi() {
    return hocPhi;
  }

  public void setHocPhi(String hocPhi) {
    this.hocPhi = hocPhi;
  }
}
