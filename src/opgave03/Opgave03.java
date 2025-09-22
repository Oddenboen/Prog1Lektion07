package opgave03;


public class Opgave03 {
    public static void main(String[] args) {
       // System.out.println(weekday(4, 14));
        System.out.println(ugedag(4,14));
    }

    public static String ugedag(int dayofWeek, int daysIntheFuture) {
        String[] ugedage = {"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};
        int dag1 = 6;
        int dag2 = 3;
        int resultatdag = (dag1 + dag2) % 7;

        return ugedage[resultatdag];

    }

    public static String weekday(int dayOfWeek, int daysInTheFuture) {
        dayOfWeek = (dayOfWeek + daysInTheFuture) % 7;
        if (dayOfWeek == 0) {
            return "Mandag";
        } else if (dayOfWeek == 1) {
            return "Tirsdag";
        } else if (dayOfWeek == 2) {
            return "Onsdag";
        } else if (dayOfWeek == 3) {
            return "Torsdag";
        } else if (dayOfWeek == 4) {
            return "Fredag";
        } else if (dayOfWeek == 5) {
            return "Lørdag";
        } else {
            return "Søndag";
        }
    }
}
