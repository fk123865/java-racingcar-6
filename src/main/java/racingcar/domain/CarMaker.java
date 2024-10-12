package racingcar.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class CarMaker {

    private final String Members;
    private static final int SET_POSITION = 0;

    public CarMaker(String Members) {
        this.Members = Members;
    }

    public Map<String, Integer> makeMap() {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] names = Members.split(",");
        for (String name : names) {
            map.put(name, SET_POSITION);
        }
        return map;
    }
}
