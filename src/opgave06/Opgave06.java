package opgave06;

import java.util.Scanner;

public class Opgave06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et romertal for at få det arabiske tal");
        String tekst = input.nextLine();
        char[] romanNumber = tekst.toCharArray();
        System.out.println(romanNumberToArabicNumber(romanNumber));
    }

    private static int romanNumberToArabicNumber(char[] romanNumber) {
        //Din implementering her.
        int sum = 0;

        for (int i = 0; i < romanNumber.length; i++) {
            sum += SingleRomanNumberToArabicNumber(romanNumber[i]);
        }

        for (int n = 0; n < romanNumber.length - 1; n++) {
            if (SingleRomanNumberToArabicNumber(romanNumber[n]) < SingleRomanNumberToArabicNumber(romanNumber[n + 1])) {
                sum -= SingleRomanNumberToArabicNumber(romanNumber[n]) * 2;
            }
        }

//CMXLIV
        return sum;
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
