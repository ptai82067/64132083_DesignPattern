package thuchanh.factory_singleton;

public class Rectangle extends Shape{
  protected Rectangle(String brush, String paper, String frame) {
    super(brush, paper, frame);
  }

  @Override
  public String draw() {
    return "Brush Rectangle is: "+this.getBrush()
            +"\nPaper Rectangle is: "+ this.getPaper()
            +"\nFrame Retangle is: "+ this.getFrame();
  }
}
