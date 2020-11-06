package racingGame.View;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import racingGame.racingGameException.CarNameLengthException;

public class InputView {

  static final String NUM_CAR_QUESTION = "자동차 댓수는 몇 대 인가요?";
  static final String USER_NAME_QUESTION = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
  static final String NUM_ROUND_QUESTION = "시도할 횟수는 몇 회 인가요?";
  static final int LENGTH_LIMIT = 5;

  static final Scanner scanner = new Scanner(System.in);

  private InputView() {
  }

  public static int askNumCar() {
    System.out.println(NUM_CAR_QUESTION);
    return scanner.nextInt();
  }

  public static List<String> askUserNames() {
    String rawInput;
    List<String> parsedInput;

    System.out.println(USER_NAME_QUESTION);
    rawInput = scanner.nextLine();

    parsedInput = parseRawInput(rawInput);
    validateParsedInput(parsedInput);

    return parsedInput;
  }

  private static List<String> parseRawInput(String rawInput) {
    return new Vector<>(Arrays.asList(rawInput.split(",")));
  }

  private static void validateParsedInput(List<String> parsedInput) {
    for (String s : parsedInput) {
      validateInputLengthRule(s);
    }
  }

  private static void validateInputLengthRule(String input) {
    if (input.length() > LENGTH_LIMIT) {
      throw new CarNameLengthException();
    }
  }

  public static int askNumRound() {
    System.out.println(NUM_ROUND_QUESTION);
    return scanner.nextInt();
  }

}
