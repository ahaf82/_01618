package a1;


class ZahlAusdenken {
    public static void main(String[] args) {
        // ↓↓↓  Eingabeaparament wird startzahl zugewiesen, sofern existent, ansonsten out-of-bounds exception
        int startzahl = transformCLIInputToInteger(args);
        // ↓↓↓ ergebnis wird gleich startzahl gesetzt.
        int ergebnis = startzahl;
        // ↓↓↓ Sofern Eingabe großer Null, addiere Zwei dazu.
        if (ergebnis > 0) {
            ergebnis = ergebnis + 2;
        } else {
            // ↓↓↓ Sofern Eingabe kleiner gleich 0, drehe vorzeichen um und addiere Zwei dazu.
            ergebnis = ergebnis * (-1) + 2;
        }
        // ↑↑↑ Kürzerer Weg für if-else statement -->  ergebnis = Math.abs(ergebnis) + 2;

        // ↓↓↓ Solange veränderte Eingabe größer Zwei, ziehe Zwei ab und weise wieder "Ergebnis" zu.
        while (ergebnis > 2) {
            ergebnis = ergebnis - 2;
        }
        // ↓↓↓ Hilfsvariable - mit totem for Code. Löschen.
        int arbeiten = 4;
        for (int i = 2; i <= 20; i = i + 2) {
            arbeiten = arbeiten + startzahl;
        }
        // ↓↓↓ Switch case für Ergebnis
        switch (ergebnis) {
            // ↓↓↓ case 0 kann nie erreicht werden, Die Eingabefälle, ungerade (pos und neg), 0, sowie gerade (pos und neg) landen hier nie.
            case 0:
                System.out.println("Das kann nicht sein!");
                break;
            case 1:
                // ↓↓↓ case 1 wird bei ungerade erreicht. weil für n gilt: f(n) = |n|+2; g(n) = 1 für n % 2 != 0 und g(n) = 2 für n % 2 == 0. Es gilt g(f(n))
                System.out.println("Die urspruengliche Zahl war ungerade!");
                break;
            case 2:
                // ↓↓↓ case 2 wird bei gerade erreicht. weil für n gilt: f(n) = |n|+2; g(n) = 1 für n % 2 != 0 und g(n) = 2 für n % 2 == 0. Es gilt g(f(n))
                System.out.println("Die urspruengliche Zahl war gerade!");
                break;
            // ↓↓↓ default case sollte nur erreicht werden, wenn eingabewert sehr nah an maxInt +-2147483647 und dadurch folgende addition über/unter maxInt
            default:
                System.out.println("Fehler!");
        }
        // ↓↓↓ Die startzahl wird erneut ausgegeben
        System.out.println("startzahl = " + startzahl);
    }

    private static int transformCLIInputToInteger(String[] args) {
        int retVal = 0;
        try {
            return Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException $exception) {
            System.out.println("No input integer provided");
            System.exit(1);
        }
        return retVal;
    }


}

