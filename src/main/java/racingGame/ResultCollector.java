package racingGame;

import java.util.List;
import java.util.Vector;

public class ResultCollector {

  private ResultCollector() {
  }

  static public List<String> extractWinners(Cars cars) {
    List<String> winners = new Vector<>();

    int winnersPosition = cars.getPositions().get(0);
    for (Car car : cars) {
      if (car.getPosition() > winnersPosition) {
        winnersPosition = car.getPosition();
      }
    }

    for (Car car : cars) {
      if (car.getPosition() == winnersPosition) {
        winners.add(car.getName());
      }
    }

    return winners;
  }

}
