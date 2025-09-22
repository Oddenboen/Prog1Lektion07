package opgave04;

import java.util.Arrays;
import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {
        System.out.print("Skirv et ord, for at se om det er et pallidrom ord: ");
        Scanner input = new Scanner(System.in);
        String ord = input.nextLine();
        pallidrom(ord);
    }

    public static void pallidrom(String ord) {
        String omvendt = new StringBuilder(ord).reverse().toString();
        char[] tekst1 = ord.toCharArray();
        char[] tekst2 = omvendt.toCharArray();

        for (int i = 0; i < tekst1.length; i++) {
            tekst1[i] = Character.toLowerCase(tekst1[i]);
            tekst2[i] = Character.toLowerCase(tekst2[i]);
        }

        if (Arrays.equals(tekst1, tekst2)) {
            System.out.println("Dette ord er et pallidrom ord");
        } else {
            System.out.println("Dette ord er ikke et pallidrom ord");
        }

    }
}
