package thuchanh.composite.b3;

import java.util.ArrayList;
import java.util.Date;

public class FolderComponent implements IFileComponent{
  String nameFolder;
  String ngayTao;
  ArrayList<IFileComponent> items;

  public FolderComponent(String nameFolder, String ngayTao) {
    this.nameFolder = nameFolder;
    this.ngayTao = ngayTao;
    items = new ArrayList<>();
  }

  void addItem(IFileComponent item){
    items.add(item);
  }
  void removeItem(IFileComponent item){
    items.remove(item);
  }

  @Override
  public String getStringTreeFolder(int depth) {
    StringBuilder stringBuilder = new StringBuilder("  ".repeat(depth) +nameFolder + "\n");
    for(var i:items){
      stringBuilder.append("    ").append(i.getStringTreeFolder(depth + 1)).append("\n");
    }
    return stringBuilder.toString();
  }

  @Override
  public String getPath() {
    return this.nameFolder;
  }
}
