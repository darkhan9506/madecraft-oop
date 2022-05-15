package exercises;

public class Minion {

  private String name;
  private int eyes;
  private String color;
  private String master;

  public Minion(final String name, final int eyes, final String color, final String master) {
    this.name = name;
    this.eyes = eyes;
    this.color = color;
    this.master = master;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getEyes() {
    return eyes;
  }

  public void setEyes(final int eyes) {
    this.eyes = eyes;
  }

  public String getColor() {
    return color;
  }

  public void setColor(final String color) {
    this.color = color;
  }

  public String getMaster() {
    return master;
  }

  public void setMaster(final String master) {
    this.master = master;
  }
}
