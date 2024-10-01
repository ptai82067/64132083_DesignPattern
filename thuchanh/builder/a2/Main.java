package thuchanh.builder.a2;

public class Main {
  public static void main(String[] args) {
    MyStringBuilder mystr = new MyStringBuilder.Builder()
            .addString("abc")
            .addFloat(1.0f)
            .addBoolean(true)
            .addString("tài đẹp trai")
            .build();
    System.out.println(mystr.toString());
  }
}
