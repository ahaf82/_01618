package A2;

public class GeoKlaus {
    public static void main(String[] args) {
        String $geometricShape = transformCLIInputToString(args);

        if ($geometricShape.equals("Quadrat")){
            System.out.println("Vier Ecken");
            System.out.println("Vier Symmetrieachsen");
            System.out.println("Ist punktsymmetrisch");
            System.out.println("Ist geschlossen");
        }

        if ($geometricShape.equals("Strecke")){
            System.out.println("Null Ecken");
            System.out.println("Null Symmetrieachsen");
            System.out.println("Ist punktsymmetrisch");
            System.out.println("Ist offen");
        }

        if ($geometricShape.equals("Dreieck")){
            System.out.println("Drei Ecken");
            System.out.println("Eventuell 1 Symmetrieachse");
            System.out.println("Ist nicht punktsymmetrisch");
            System.out.println("Ist geschlossen");
        }

        if ($geometricShape.equals("Rechtwinkliges Dreieck")){
            System.out.println("Drei Ecken");
            System.out.println("Eine Symmetrieachsen");
            System.out.println("Ist nicht punktsymmetrisch");
            System.out.println("Ist geschlossen");
        }

        if ($geometricShape.equals("Kreis")){
            System.out.println("Null Ecken");
            System.out.println("Unendlich Symmetrieachsen");
            System.out.println("Ist nicht punktsymmetrisch");
            System.out.println("Ist geschlossen");
        }

        if ($geometricShape.equals("Ellipse")){
            System.out.println("Null Ecken");
            System.out.println("Zwei Symmetrieachsen");
            System.out.println("Ist nicht punktsymmetrisch");
            System.out.println("Ist geschlossen");
        }

        if ($geometricShape.equals("Viereck")){
            System.out.println("Vier Ecken");
            System.out.println("Max 4 Symmetrieachsen");
            System.out.println("Ist eventuell punktsymmetrisch (Trapez)");
            System.out.println("Ist geschlossen");
        }

        if ($geometricShape.equals("Trapez")){
            System.out.println("Vier Ecken");
            System.out.println("Eine Symmetrieachsen");
            System.out.println("Ist punktsymmetrisch");
            System.out.println("Ist geschlossen");
        }

        if ($geometricShape.equals("Fünfeck")){
            System.out.println("Vier Ecken");
            System.out.println("Max 5 Symmetrieachsen");
            System.out.println("Ist eventuell punktsymmetrisch");
            System.out.println("Ist geschlossen");
        }

        if ($geometricShape.equals("Pentagondodekaeder")){
            System.out.println("Zwanzig Ecken");
            System.out.println("15 Symmetrieachsen");
            System.out.println("Ist punktsymmetrisch");
            System.out.println("Ist geschlossen");
        }
    }

    private static String transformCLIInputToString(String[] args) {
        String retVal = "";
        try {
            retVal = args[0];
        } catch (ArrayIndexOutOfBoundsException $exception){
            System.out.println("No input given");
            System.exit(1);
        }
          return retVal;
    }
}



