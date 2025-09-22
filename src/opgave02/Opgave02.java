package opgave02;

import java.util.Arrays;

public class Opgave02 {
    public static void main(String[] args) {
        char[] characterArray = getCharacterArray();
        vokalerMethode(characterArray);
        leet(characterArray);
    }

    private static char[] getCharacterArray() {
        return ("Der var så dejligt ude på landet; det var sommer, kornet stod gult, havren grøn, " +
                "høet var rejst i stakke nede i de grønne enge, og der gik storken på sine lange, " +
                "røde ben og snakkede ægyptisk, for det sprog havde han lært af sin moder. Rundt om" +
                " ager og eng var der store skove, og midt i skovene dybe søer; jo, der var rigtignok " +
                "dejligt derude på landet! Midt i solskinnet lå der en gammel herregård med dybe kanaler" +
                " rundt om, og fra muren og ned til vandet voksede store skræppeblade, der var så høje," +
                " at små børn kunne stå oprejste under de største; der var lige så vildsomt derinde, som " +
                "i den tykkeste skov, og her lå en and på sin rede; hun skulle ruge sine små ællinger ud, " +
                "men nu var hun næsten ked af det, fordi det varede så længe, og hun sjælden fik visit;" +
                " de andre ænder holdt mere af at svømme om i kanalerne, end at løbe op og sidde under " +
                "et skræppeblad for at snadre med hende." +
                "Endelig knagede det ene æg efter det andet: pip! pip! sagde det, alle æggeblommerne " +
                "var blevet levende og stak hovedet ud." +
                "Rap! rap! sagde hun, og så rappede de sig alt hvad de kunne, og så til alle sider " +
                "under de grønne blade, og moderen lod dem se så meget de ville, for det grønne er godt for " +
                "øjnene. Hvor dog verden er stor! sagde alle ungerne; thi de havde nu rigtignok ganske " +
                "anderledes plads, end da de lå inde i ægget. Tror I, det er hele verden! sagde moderen, " +
                "den strækker sig langt på den anden side haven, lige ind i præstens mark! " +
                "men der har jeg aldrig været! – I er her dog vel alle sammen! – og så rejste hun sig" +
                " op, nej, jeg har ikke alle! det største æg ligger der endnu; hvor længe skal det vare! nu er " +
                "jeg snart ked af det! og så lagde hun sig igen.").toCharArray();
    }

    private static int[] vokalerMethode(char[] characterArray) {
        //char[] voklar = {'a','e','i','o','u','y','æ','ø','å'};
        int[] antalVoklar = new int[9];

        for (int i = 0; i < characterArray.length; i++) {
            char tegn = Character.toLowerCase(characterArray[i]);

            switch (tegn) {
                case 'a': antalVoklar[0]++; break;
                case 'e': antalVoklar[1]++; break;
                case 'i': antalVoklar[2]++; break;
                case 'o': antalVoklar[3]++; break;
                case 'u': antalVoklar[4]++; break;
                case 'y': antalVoklar[5]++; break;
                case 'æ': antalVoklar[6]++; break;
                case 'ø': antalVoklar[7]++; break;
                case 'å': antalVoklar[8]++; break;
            }
        }
        System.out.println(Arrays.toString((antalVoklar)));

        return antalVoklar;

    }

    private static void leet(char[] characterArray) {
        char[] leetSpeak = new char[characterArray.length];

        for (int n = 0; n < characterArray.length; n++) {
            leetSpeak[n] = characterArray[n];
        }

        for (int i = 0; i < characterArray.length; i++) {
            char leetTegn = characterArray[i];

            switch (leetTegn) {
                case 'a': leetSpeak[i] = '@'; break;
                case 'A': leetSpeak[i] = '4'; break;
                case 'b': leetSpeak[i] = '6'; break;
                case 'B': leetSpeak[i] = '8'; break;
                case 'C': leetSpeak[i] = 'c'; break;
                case 'E': leetSpeak[i] = '3'; break;
                case 'I': leetSpeak[i] = '|'; break;
                case 'J': leetSpeak[i] = ']'; break;
                case 'g': leetSpeak[i] = '9'; break;
                case 'O': leetSpeak[i] = '0'; break;
                case 'S': leetSpeak[i] = '$'; break;
                case 'j': leetSpeak[i] = 'j'; break;
                case 'T': leetSpeak[i] = '7'; break;
                case 'l': leetSpeak[i] = '1'; break;
                case 's': leetSpeak[i] = '5'; break;
                case 't': leetSpeak[i] = '+'; break;
                case 'Z': leetSpeak[i] = '2'; break;
            }

        }
        String leetTeskst = new String(leetSpeak);
        System.out.println(leetTeskst);

    }

}
