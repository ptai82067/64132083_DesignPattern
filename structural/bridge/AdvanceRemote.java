package structural.bridge;

public class AdvanceRemote extends Remote{
  public AdvanceRemote(Device device) {
    super(device);
  }

  @Override
  void togglePower() {
    System.out.println("toggle power");
    if (device != null){
      device.turnOn();
    }

  }

  @Override
  void setVolume(int volume) {
   device.setVolume(volume);
  }

  void mute(){
    device.setVolume(0);
  }
}
