package racingGame;

public class Car {

  private int position;
  private String name;

  Car() {
  }

  private Car(int initialPosition, String name) {
    this.position = initialPosition;
    this.name = name;
  }

  static public Car of(int position) {
    return new Car(position, "");
  }

  static public Car of(String name) {
    return new Car(0, name);
  }

  public int move(int delta) {
    position += delta;
    return this.position;
  }

  public int getPosition() {
    return this.position;
  }

  public String getName() {
    return this.name;
  }

}
