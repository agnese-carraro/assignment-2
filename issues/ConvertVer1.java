
public class ConvertVer1 {
    public static String conv(int number) {
        String result = "";

        // da tenere dall'inizio
        String[] c1 = {"I","II","III","IV","V", "VI", "VII", "VIII", "IX"};

        // da tenere dall'inizio
        if (number > 0 && number < 10) {
            result = result.concat(c1[number-1]);
        }

        if (!result.isEmpty()) {return result;}
        else {return null;}
    }
}
