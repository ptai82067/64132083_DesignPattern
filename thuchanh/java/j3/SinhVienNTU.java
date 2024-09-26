package thuchanh.java.j3;

public abstract class SinhVienNTU {
  private String hoTen;
  private String ngang;

  public SinhVienNTU() {
  }

  public SinhVienNTU(String hoTen, String ngang) {
    this.hoTen = hoTen;
    this.ngang = ngang;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getNganh() {
    return ngang;
  }

  public abstract float getDiemTB();
  public String getHocLuc(){
    float dtb = getDiemTB();
    if(dtb>=9.0f){
      return "Xuất Sắc";
    }
    if (dtb>=8.0f) {
      return "Giỏi";
    }
    if (dtb>=7.0f) {
      return "Khá";
    }
    if (dtb>=5.0f) {
      return "Trung Bình";
    }
    if (dtb>=3.0f) {
      return "Yếu";
    }
    return "Kém";
  };
  public void inThongTin(){
    System.out.println("Tên sinh viên: "+ getHoTen());
    System.out.println("Tên ngàng: "+ getNganh());
    System.out.println("Điểm trung bình: "+ getDiemTB());
    System.out.println("Học lực: "+ getHocLuc());

  };
}
