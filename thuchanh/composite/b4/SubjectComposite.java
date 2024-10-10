package thuchanh.composite.b4;

import java.util.ArrayList;

public class SubjectComposite implements SubjectComponent{
  private String name;
  ArrayList<SubjectComponent> items;

  public SubjectComposite(String name) {
    this.name = name;
    items = new ArrayList<>();
  }

  void add(SubjectComponent item){
    items.add(item);
  }
  void remove(SubjectComponent item){
    items.remove(item);
  }
  @Override
  public String getTreeSubject(int depth) {
    StringBuilder builder = new StringBuilder("   ".repeat(depth) + name +"\n");
    for(var i:items){
      builder.append("   ").append(i.getTreeSubject(depth+1)).append("\n");
    }
    return builder.toString();
  }

  @Override
  public int getTotalCredits() {
    int total = 0;
    for (var i:items){
      total += i.getTotalCredits();
    }

    return total;
  }

  @Override
  public int getTuitionFees() {
    return 0;
  }
}
