package opgave04;

public class Opgave04 {
    public static void main(String[] args) {
        char[] romanNumber = {'M', 'L', 'X', 'I'}; //1061
        char[] romanNumber2 = {'C','M','X','L','I','V'};
        System.out.println(romanNumberToArabicNumber(romanNumber2));
    }

    private static int romanNumberToArabicNumber(char[] romanNumber) {
        int sumOfRomanNumber = 0;
        int arabicTemp = 0;
        int[] arabicNumbers = new int[romanNumber.length];
        for (int charIndex = 0; charIndex < romanNumber.length; charIndex++){
            arabicNumbers[charIndex] = SingleRomanNumberToArabicNumber(romanNumber[charIndex]);
        }
        for (int numberIndex = (romanNumber.length - 1); numberIndex >= 0; numberIndex--){
            if (arabicNumbers[numberIndex] < arabicTemp){
                sumOfRomanNumber -= arabicNumbers[numberIndex];
            } else {
                sumOfRomanNumber += arabicNumbers[numberIndex];
            }
            arabicTemp = arabicNumbers[numberIndex];
        }

        return sumOfRomanNumber;
    }

    private static int SingleRomanNumberToArabicNumber(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException(roman + " is not a valid roman number literal.");
        };
    }
}
