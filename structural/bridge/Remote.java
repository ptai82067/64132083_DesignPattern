package structural.bridge;

public abstract class Remote {
  protected Device device;

  public Remote(Device device) {
    this.device = device;
  }
  abstract void togglePower();
  abstract void setVolume(int volume);
}
