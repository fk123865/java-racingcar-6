package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Map;

public class Car {

    private final Map<String, Integer> result;

    private Car(String names) {
        CarMaker carMaker = new CarMaker(names);
        result = carMaker.makeMap();
    }

    public static Car from(String names) {
        return new Car(names);
    }

    public void start() {
        for (String name : result.keySet()) {
            counter(name);
        }
    }

    public String getWinner() {
        return GetWinner.winner(result);
    }

    private void counter(String name) {
        int number = Randoms.pickNumberInRange(0, 9);
        if (CarMove.numberIsOverFour(number)) {
            result.put(name, result.get(name) + 1);
        }
    }

    public Map<String, Integer> getResult() {
        return result;
    }
}
