package opgave01;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        sumDigitFrequence(integerArray);

    }

    private static int[] getIntegerArray() {
        int[] integerArray =  { 1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002 };
        return integerArray;
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public static double averageArray(int[] array) {
        return (double) sumArray(array) / array.length;
    }

    public static int[] sumArrayDigits(int[] array) {
        int[] summedDigits = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            summedDigits[index] = sumDigits(array[index]);
        }
        return summedDigits;
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number >= 10) {
            sum += number % 10;
            number = number / 10;
        }
        sum += number;
        return sum;
    }

    public static int[] sumDigitFrequence(int[] array){
        int[] sumFrequence = new int[9];
        array = sumArrayDigits(array);
        for (int index = 0; index < array.length; index++) {
            while (array[index] > 10) {
                array[index] = sumDigits(array[index]);
            }
            for (int number = 0; number < 9; number++){
                if (array[index] == (number + 1)) {
                    sumFrequence[number]++;
                }
            }
        }
        return sumFrequence;
    }
}
