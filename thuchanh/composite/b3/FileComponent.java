package thuchanh.composite.b3;

import java.util.Date;

public class FileComponent implements IFileComponent{
  String nameFile;
  String ngayTao;

  public FileComponent(String nameFile, String ngayTao) {
    this.nameFile = nameFile;
    this.ngayTao = ngayTao;
  }

  @Override
  public String getStringTreeFolder(int depth) {
    return "  ".repeat(depth) + this.nameFile;
  }

  @Override
  public String getPath() {
    return this.nameFile;
  }
}
