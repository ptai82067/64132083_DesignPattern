package thuchanh.factory_singleton;

public class Main {
  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();
    Shape shape = factory.createShape(ShapeType.Rectangle);
    System.out.println(shape.draw());
    shape = factory.createShape(ShapeType.Rectangle);
    System.out.println(shape.draw());
  }
}
