package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GetWinner {

    public static String winner(Map<String, Integer> result) {
        int maxNum = getMaxNum(result);
        List<String> winners = getWinnerList(result, maxNum);
        return String.join(", ", winners);
    }

    private static List<String> getWinnerList(Map<String, Integer> result, int maxNum) {
        List<String> winners = new ArrayList<>();
        for (String name : result.keySet()) {
            if (result.get(name) == maxNum) {
                winners.add(name);
            }
        }
        return winners;
    }

    private static int getMaxNum(Map<String, Integer> result) {
        int maxNum = 0;
        for (Integer value : result.values()) {
            if (value > maxNum) {
                maxNum = value;
            }
        }
        return maxNum;
    }
}
