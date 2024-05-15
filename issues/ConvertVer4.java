public class ConvertVer4 {
    public static String conv(int number) {
        String result = "";
        // da aggiungere al quarto passo
        String[] c4 = {"M"};
        // da aggiungere al terzo passo.
        String[] c3 = {"C","CC","CCC","CD","D", "DC", "DCC", "DCCC", "CM"};
        // da aggiungere al secondo passo.
        String[] c2 = {"X","XX","XXX","XL","L", "LX", "LXX", "LXXX", "XC"};
        // da tenere dall'inizio
        String[] c1 = {"I","II","III","IV","V", "VI", "VII", "VIII", "IX"};

        // da aggiungere al quarto passo
        int n = number /1000;
        if (n > 1 && n < 10) {
            result = result.concat(c4[n-1]);
            number  = number - n*1000;
        }


        // da aggiungere al terzo passo.
        n = number /100;
        if (n > 1 && n < 10) {
            result = result.concat(c3[n-1]);
            number  = number - n*100;
        }


        // da aggiungere al seecondo passo.
        n = number /10;
        if (n > 1 && n < 10) {
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

}
