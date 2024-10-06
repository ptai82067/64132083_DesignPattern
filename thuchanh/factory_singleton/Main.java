package thuchanh.factory_singleton;

public class Main {
  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();
    Shape shape = factory.createShape(ShapeType.CIRCLE);
    System.out.println(shape.draw());
    shape = factory.createShape(ShapeType.CIRCLE);
    System.out.println(shape.draw());
//    Shape s1 = Shape.getInstance(ShapeType.RECTANGLE);
//
//    System.out.println(s1.draw());
  }
}