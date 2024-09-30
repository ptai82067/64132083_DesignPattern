package thuchanh.factory_singleton;

import java.util.Scanner;

public class ShapeFactory {
  public Shape createShape(ShapeType shapeType){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bursh of "+shapeType.toString());
    String brush = scanner.nextLine();
    System.out.println("Paper of "+shapeType.toString());
    String paper = scanner.nextLine();
    System.out.println("frame of "+shapeType.toString());
    String frame = scanner.nextLine();
    switch (shapeType){
      case Rectangle -> {
        return Rectangle.getInstance(shapeType, new Rectangle(brush,paper,frame));
      }
      case Triangle -> {
        return Triangle.getInstance(shapeType, new Triangle(brush,paper,frame));
      }
      case Circle -> {
        return  Circle.getInstance(shapeType,new Circle(brush,paper,frame));
      }
    }
    return null;
  }
}
