package racingGame.View;

import racingGame.Cars;

import java.util.List;
import racingGame.ResultCollector;

public class ResultView {

  private static final String RESULT_MESSAGE = "실행 결과";
  private static final String WINNER_MESSAGE = "우승자";

  private ResultView() {
  }

  static public void printResultMessage() {
    System.out.println(RESULT_MESSAGE);
  }

  static public void printCurrentStates(Cars cars) {
    List<Integer> positions = cars.getPositions();

    for (Integer position : positions) {
      printDash(position);
    }
    System.out.println();
  }

  static private void printDash(int numDash) {
    for (int i = 0; i < numDash; i++) {
      System.out.print("-");
    }
    System.out.println();
  }

  static public void printCurrentStatesWithName(Cars cars) {
    for (int i = 0; i < cars.getPositions().size(); i++) {
      cars.getPositions().get(i)
    }
  }

  static public void printWinner(Cars cars) {
    List<String> winners = ResultCollector.extractWinners(cars);

  }

}
