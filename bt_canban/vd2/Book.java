package bt_canban.vd2;

public class Book implements Product{
  @Override
  public void use(){
    System.out.printf("This is Book");
  }
}
