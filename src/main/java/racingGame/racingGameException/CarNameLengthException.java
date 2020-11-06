package racingGame.racingGameException;

public class CarNameLengthException extends ArithmeticException{
  public CarNameLengthException(){
    super("자동차 이름이 5자를 초과합니다.");
  }
}
