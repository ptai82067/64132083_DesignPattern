package thuchanh.factory_singleton;

import java.util.HashMap;
import java.util.Map;

public abstract class Shape {
  private String brush, paper, frame;
  private static Map<ShapeType,Shape> instance = new  HashMap<ShapeType,Shape>();

  protected Shape(String brush, String paper, String frame) {
    this.brush = brush;
    this.paper = paper;
    this.frame = frame;
  }

  public String getBrush() {
    return brush;
  }

  public void setBrush(String brush) {
    this.brush = brush;
  }

  public static Shape getInstance(ShapeType type, Shape shape) {

    if(!instance.containsKey(type)){
      instance.put(type,shape);

    }
    // if (type == ShapeType.REC){
    //    instance.put(type,new Rec(,,,))
    //}
    return instance.get(type);
  }
//public static Shape getInstance(ShapeType type) {
//   if (type == ShapeType.RECTANGLE){
//
//     if(!instance.containsKey(type)){
//
//       instance.put(type,new Rectangle());
//
//     }
//  }
//  return instance.get(type);
//}


  public String getFrame() {
    return frame;
  }

  public void setFrame(String frame) {
    this.frame = frame;
  }

  public String getPaper() {
    return paper;
  }

  public void setPaper(String paper) {
    this.paper = paper;
  }
  public abstract String draw();
}
