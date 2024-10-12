package racingcar.view;

public class InputValidation {

    public String readNameValidation(String input) {
        if (!input.contains(",") || lengthValidation(input) || nameValidation(input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    private boolean lengthValidation(String input) {
        String[] names = input.split(",");
        for (String name : names) {
            if (name.length() > 5) {
                return true;
            }
        }
        return false;
    }

    private boolean nameValidation(String input) {
        String[] names = input.split(",");
        for (String name : names) {
            if (isNotAlphabet(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isNotAlphabet(String name) {
        return !name.matches("[a-zA-Z]+");

    }

    public int readCountValidation(String input) {
        if (isNotNumber(input) || Integer.parseInt(input) <= 0) {
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(input);
    }

    private boolean isNotNumber(String input) {
        return (input.matches("[\\D+]]"));
    }
}
