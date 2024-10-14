package racingcar.domain;

public class CarMove {

    private static final int MOVING_FORWARD = 4;

    public static boolean numberIsOverFour(int number) {
        return number >= MOVING_FORWARD;
    }
}
