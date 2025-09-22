package opgave05;

import java.util.Scanner;

public class Opgave05 {
    public static void main(String[] args) {
        System.out.println("Det første tal der blev skrevet 4 gange i træk var: " + fourInARow());
    }

    public static int fourInARow() {
        int variable1 = 0;
        int variable2 = 0;
        int variable3 = 0;
        // int variable4 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast nogle tal, for at få det første tal der bliver skrevet 4 gange i streg");
        int tal = -1;

        while (true) {
            if (tal == variable1) {
                if (variable2 == tal) {
                    if (variable3 == tal) {
                        return variable3;
                    }
                    variable3 = tal;
                }
                variable2 = tal;
            } else {
                variable1 = tal;
            }

            tal = input.nextInt();
        }


    }
}
