package racingGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomScoreGeneratorTest {

    @Test
    @DisplayName("동일 값 출력 확인")
    void equalityTest() {
        RandomScoreGenerator scoreGenerator = new RandomScoreGenerator(0);
        RandomScoreGenerator scoreGenerator1 = new RandomScoreGenerator(0);

        int numTry = 10;

        List<Integer> result = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();

        for (int i = 0; i < numTry; i++) {
            result.add(scoreGenerator.generateScore());
            result1.add(scoreGenerator1.generateScore());
        }

        assertThat(result).isEqualTo(result1);

    }

    @Test
    @DisplayName("매번 다른 값 출력하는 지 테스트")
    void diverseOutput() {

        RandomScoreGenerator scoreGenerator = new RandomScoreGenerator();
        RandomScoreGenerator scoreGenerator1 = new RandomScoreGenerator();

        int numTry = 100;

        List<Integer> result = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();

        for (int i = 0; i < numTry; i++) {
            result.add(scoreGenerator.generateScore());
            result1.add(scoreGenerator1.generateScore());
        }

        assertThat(result).isNotEqualTo(result1);

    }

}