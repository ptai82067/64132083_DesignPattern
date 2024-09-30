package creational.builder.computer.clc642;

public class Main {
  public static void main(String[] args) {
    Computer642 computer642 =   new Computer642.Builder()
            .builderCPU("Intel Arrow Lake Ultra")
            .builderRam("64GB Ram Sumsung")
            .builderStorage("2T SSD Sumgsung Revo")
            .builderScreen("LG 24 inch 4K")
            .build();
    System.out.println(computer642.toString());
  }
}
