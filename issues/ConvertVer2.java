public class ConvertVer2 {
    public static String conv(int number) {
        String result = "";

        // da aggiungere al secondo passo.
        String[] c2 = {"X","XX","XXX","XL","L", "LX", "LXX", "LXXX", "XC"};
        // da tenere dall'inizio
        String[] c1 = {"I","II","III","IV","V", "VI", "VII", "VIII", "IX"};

        // da aggiungere al secondo passo.
        int n = number/10;
        if (n > 0 && n < 10) {
            result = result.concat(c2[n-1]);
            number  = number - n*10;
        }

        // da tenere dall'inizio
        if (number > 0 && number < 10) {
            result = result.concat(c1[number-1]);
        }

        if (!result.isEmpty()) {return result;}
        else {return null;}
    }
    public static void main(String[] args) {
        System.out.print(conv(10));
    }
}
