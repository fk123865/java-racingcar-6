package racingcar.domain;

public class CarMove {

    private static final int MOVABLE_LOWER_BOUND = 4;

    public static boolean numberIsOverFour(int number) {
        return number >= MOVABLE_LOWER_BOUND;
    }
}
