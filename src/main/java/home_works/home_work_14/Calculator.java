package home_works.home_work_14;

public class Calculator {

    public static void main(String[] args) {
        float firstValue = Float.parseFloat(args[0]);
        String operation = args[1];
        float secondValue = Float.parseFloat(args[2]);
        System.out.println("Result: " + calc(firstValue, secondValue, operation));
    }

    public static float calc(float firstValue, float secondValue, String operation) {
        if (operation.equals("x")) operation = "*";
        switch (operation) {
            case "+" -> {
                return firstValue + secondValue;
            }
            case "-" -> {
                return firstValue - secondValue;
            }
            case "*" -> {
                return firstValue * secondValue;
            }
            case "/" -> {
                return firstValue / secondValue;
            }
            default -> System.out.println("Wrong operation!");
        }
        return 0;
    }
}
