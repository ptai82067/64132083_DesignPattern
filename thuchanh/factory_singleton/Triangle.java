package thuchanh.factory_singleton;

public class Triangle extends Shape{

  protected Triangle(String brush, String paper, String frame) {
    super(brush, paper, frame);
  }

  @Override
  public String draw() {
    return "Brush Triangle is: "+this.getBrush()
            +"\nPaper Triangle is: "+ this.getPaper()
            +"\nFrame Triangle is: "+ this.getFrame();
  }
}
