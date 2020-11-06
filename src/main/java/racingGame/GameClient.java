package racingGame;

import java.util.List;
import racingGame.View.InputView;
import racingGame.View.ResultView;

public class GameClient {

  private static void runGame(Cars cars, int numRound) {
    int currentRound = 1;
    ScoreGenerator scoreGenerator = new RandomScoreGenerator();

    ResultView.printResultMessage();

    for (; !isFinished(currentRound, numRound); currentRound += 1) {
      cars.moves(scoreGenerator);
      ResultView.printCurrentWithName(cars);
    }

    ResultView.printWinner(cars);
  }

  private static boolean isFinished(int currentRound, int numRound) {
    return currentRound > numRound;
  }

  public static void main(String[] args) {
    List<String> users;
    int numRound;
    Cars cars;

    users = InputView.askUserNames();
    numRound = InputView.askNumRound();

    cars = Cars.of(users);
    runGame(cars, numRound);
  }

}
