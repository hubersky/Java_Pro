package home_works.home_work11;

public class Main {
    public static void main(String[] args) {
        String[][] numbers = {{"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}, {"2", "2", "2", "2"}};
        ArrayValueCalculator calculator = new ArrayValueCalculator();
        try {
            System.out.println(calculator.doCalc(numbers));
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
