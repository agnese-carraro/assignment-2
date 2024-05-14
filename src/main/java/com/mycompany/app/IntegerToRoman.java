
package com.mycompany.app;

public class IntegerToRoman {
    public static String conv(int number) {
        String result = "";
        String[] c1 = {"M"};
        // da aggiungere al terzo passo.
        String[] c2 = {"C","CC","CCC","CD","D", "DC", "DCC", "DCCC", "CM"};
        // da aggiungere al secondo passo.
        String[] c3 = {"X","XX","XXX","XL","L", "LX", "LXX", "LXXX", "XC"};
        // da tenere dall'inizio
        String[] c4 = {"I","II","III","IV","V", "VI", "VII", "VIII", "IX"};

        int n = number /1000;
        if (n != 0) {
            result = result.concat(c1[n-1]);
            number  = number - n*1000;
        }


        // da aggiungere al terzo passo.
        n = number /100;
        if (n != 0) {
            result = result.concat(c2[n-1]);
            number  = number - n*100;
        }


        // da aggiungere al seecondo passo.
        n = number /10;
        if (n != 0) {
            result = result.concat(c3[n-1]);
            number  = number - n*10;
        }

        // da tenere dall'inizio
        if (number > 0 && number < 10) {
            result = result.concat(c4[number-1]);
        }

        if (!result.isEmpty()) return result;
        else {return null;}
    }

}
