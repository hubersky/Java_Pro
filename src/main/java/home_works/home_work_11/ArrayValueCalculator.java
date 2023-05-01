package home_works.home_work_11;

public class ArrayValueCalculator {

    public int doCalc(String[][] numbers) throws ArraySizeException, ArrayDataException {
        if (numbers.length != 4 || numbers[0].length != 4 | numbers[1].length != 4 |
                numbers[2].length != 4 | numbers[3].length != 4)
            throw new ArraySizeException("Matrix doesn't correspond 4x4 format!");
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers[i].length; k++) {
                try {
                    result += Integer.parseInt(numbers[i][k]);
                } catch (NumberFormatException ex) {
                    throw new ArrayDataException("Number format exception in column: [" + i + "][" + k + "]");
                }
            }
        }
        return result;
    }
}

