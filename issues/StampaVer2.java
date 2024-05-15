public class StampaVer2 {
    public static String print(int num){
        return printAsciiArt(ConvertVer2.conv(num));
    }
    private static String printAsciiArt(String romanNumber){
        String result = "";

        // lettera I
        String[] i = {" _____ ", "|_   _|", "  | |  ",
                "  | |  ", " _| |_ ", "|_____|"};

        // lettera V
        String[] v = {" __      __ ", " \\ \\    / / ",
                "  \\ \\  / /  ", "   \\ \\/ /   ",
                "    \\  /    ", "     \\/     "};

        // lettera X
        String[] x = {" __   __ ", " \\ \\ / / ", "  \\ V /  ",
                "   > <   ", "  / . \\  ", " /_/ \\_\\ "};

        // lettera L
        String[] l = {"  _      ", " | |     ", " | |     ",
                " | |     ", " | |____ ", " |______|"};

        // lettera C
        String[] c = {"   _____ ", "  / ____|", " | |     ",
                " | |     ", " | |____ ", "  \\_____|"};


        if (romanNumber != null) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < romanNumber.length(); k++) {
                    char letter = romanNumber.charAt(k);
                    if (letter == 'I') {
                        result = result.concat(i[j]);
                    } else if (letter == 'V') {
                        result = result.concat(v[j]);
                    } else if (letter == 'X') {
                        result = result.concat(x[j]);
                    } else if (letter == 'L') {
                        result = result.concat(l[j]);
                    } else if (letter == 'C') {
                        result = result.concat(c[j]);
                    }
                }
                result = result.concat("\n");
            }
        }

        if (!result.isEmpty()) {return result;}
        else {return null;}
    }
    public static void main(String[] args) {
        System.out.print(print(9));
    }
}
