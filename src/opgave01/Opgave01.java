package opgave01;

import java.lang.reflect.Array;

public class Opgave01 {
    public static void main(String[] args) {
        int[] integerArray = getIntegerArray();
        int n = Array.getLength(integerArray);
        //udskriv(integerArray, n);
        //plus(integerArray, n);
        //gennemsnit(integerArray, n, plus(integerArray, n));
        //crossSum(integerArray, n);
        crossSum2(integerArray, n);
        //System.out.println(crossSum(9));
        //System.out.println(crossSum(123));
    }

    public static int[] crossSum(int[] integerArray, int n) {
        int[] returArray = new int[n];

        for (int i = 0; i < n; i++) {
            int crossSum = 0;

            while (integerArray[i] > 9) {
                crossSum += integerArray[i] % 10;
                integerArray[i] = integerArray[i] / 10;
            }
            returArray[i] = crossSum + integerArray[i];
            // System.out.println(returArray[i]);

        }

        return returArray;
    }

    private static int[] crossSum2(int[] integerArray, int n) {
        int[] digitalRoots = new int[n];
        int[] digitalRootsCounter = new int[10];

        for (int i = 0; i < n; i++) {
            int value = integerArray[i];

            while (value > 9) {
                int sum = 0;
                while (value > 0) {
                    sum += value % 10;
                    value /= 10;
                }
                value = sum;
            }
            digitalRoots[i] = value;
            System.out.println(digitalRoots[i]);
        }
        for (int root : digitalRoots) {
            if (root >= 1 && root <= 9) {
                digitalRootsCounter[root]++;
            }
        }

        for (int i = 0; i < digitalRootsCounter.length; i++) {
            System.out.println("Der er " + i + " tal med værdien " + digitalRootsCounter[i]);
        }

        return digitalRoots;
    }

    private static int[] getIntegerArray() {
        int[] integerArray = {1095, 12, 9065, 387, 700, 20, 5, 2065, 97654, 103, 789, 50, 1972, 200, 35, 98, 1002};
        return integerArray;
    }


    private static double gennemsnit(int[] integerArray, int n, int sum) {
        double average = 1.0 * sum / n;
        return average;
    }

    private static int plus(int[] integerArray, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += integerArray[i];
        }

        return sum;
    }

    private static void udskriv(int[] integerArray, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(integerArray[i]);
        }
    }
}
