package creational.builder.computer.clc642;

public class Computer642 {
  String cpu;
  String ram;
  String storage;
  String screen;
  protected Computer642(Builder b){
    this.cpu = b.cpu;
    this.ram = b.ram;
    this.storage = b.storage;
    this.screen = b.screen;
  }
  public static class Builder{
    String cpu;
    String ram;
    String storage;
    String screen;
    public Builder builderCPU(String cpu){
      this.cpu = cpu;
      return this;
    }
    public Builder builderRam(String ram){
      this.ram = ram;
      return this;
    }
    public Builder builderStorage(String storage){
      this.storage= storage;
      return this;
    }
    public Builder builderScreen(String screen){
      this.screen = screen;
      return this;
    }
    public Computer642 build(){
      return new Computer642(this);
    }
  }

  @Override
  public String toString() {
    return "Computer642{" +
            "cpu='" + cpu + '\'' +
            ", ram='" + ram + '\'' +
            ", storage='" + storage + '\'' +
            ", screen='" + screen + '\'' +
            '}';
  }
}
