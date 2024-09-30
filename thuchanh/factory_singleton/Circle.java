package thuchanh.factory_singleton;

class Circle extends Shape{

  protected Circle(String brush, String paper, String frame) {
    super(brush, paper, frame);
  }
  @Override
  public String draw(){
    return "Brush Circle is: "+this.getBrush()
            +"\nPaper Circle is: "+ this.getPaper()
            +"\nFrame Circle is: "+ this.getFrame();
  }
}
