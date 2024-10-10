package thuchanh.composite.b4;

public class SubjectLeaf implements SubjectComponent{
  private String name;
  private int credits;

  public SubjectLeaf(String name, int credits) {
    this.name = name;
    this.credits = credits;
  }

  @Override
  public String getTreeSubject(int depth) {
    return "   ".repeat(depth) + this.name;
  }

  @Override
  public int getTotalCredits() {
    return this.credits;
  }

  @Override
  public int getTuitionFees() {
    return 1000000*this.credits;
  }
}
