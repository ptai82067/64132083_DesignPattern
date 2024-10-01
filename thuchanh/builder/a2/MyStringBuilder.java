package thuchanh.builder.a2;

public class MyStringBuilder {
  String str;
  private MyStringBuilder(Builder b){
    this.str = b.str;
  }
  public void addString(String s){
    this.str+=s;
  }
  public void addFloat(float s){
    this.str+=s;
  }public void addBoolean(boolean s){
    this.str+=s;
  }

  @Override
  public String toString() {
    return "MyStringBuilder{" +
            "str='" + str + '\'' +
            '}';
  }
  public static class Builder{
    String str;

    public Builder() {
      this.str="";
    }

    public Builder addString(String s){
      str+=s;
      return this;
    }
    public Builder addFloat(float f){
      str+=f;
      return this;
    }
    public Builder addBoolean(boolean b){
      str+=b+"";
      return this;
    }
    public MyStringBuilder build(){
      return new MyStringBuilder(this);
    }
  }
}
