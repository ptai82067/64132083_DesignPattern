package thuchanh.composite.b3;

public class Main {
  public static void main(String[] args) {
    FolderComponent root = new FolderComponent("Data (D:)", "2024-01-01");
    FolderComponent taiLieu = new FolderComponent("TaiLieu", "2024-01-02");
    FolderComponent designPattern = new FolderComponent("Design Pattern", "2024-01-03");
    FolderComponent lapTrinhJava = new FolderComponent("Lap Trinh Java", "2024-01-04");
    FolderComponent lapTrinhThietBiDiDong = new FolderComponent("LapTrinhThietBiDiDong", "2024-01-05");

    // Tạo file
    FileComponent creationalPattern = new FileComponent("CreationalPattern.pptx", "2024-01-06");
    FileComponent structuralPattern = new FileComponent("StructuralPattern.pptx", "2024-01-07");
    FileComponent javaCoBan = new FileComponent("LapTrinhJavaCoBan.docx", "2024-01-08");
    FileComponent javaNangCao = new FileComponent("LapTrinhJavaNangCao.pdf", "2024-01-09");
    FileComponent ngonNguC = new FileComponent("NgonNguLapTrinhC.pdf", "2024-01-10");
    FileComponent coBanDiDong = new FileComponent("CoBan.pptx", "2024-01-11");
    FileComponent nangCaoDiDong = new FileComponent("NangCao.pptx", "2024-01-12");

    // Xây dựng cây thư mục
    designPattern.addItem(creationalPattern);
    designPattern.addItem(structuralPattern);

    lapTrinhJava.addItem(javaCoBan);
    lapTrinhJava.addItem(javaNangCao);
    lapTrinhJava.addItem(ngonNguC);

    lapTrinhThietBiDiDong.addItem(coBanDiDong);
    lapTrinhThietBiDiDong.addItem(nangCaoDiDong);

    taiLieu.addItem(designPattern);
    taiLieu.addItem(lapTrinhJava);
    taiLieu.addItem(lapTrinhThietBiDiDong);

    root.addItem(taiLieu);

    // Hiển thị cây thư mục
    System.out.println(root.getStringTreeFolder(0));
    System.out.println(lapTrinhThietBiDiDong.getPath());
  }
}
