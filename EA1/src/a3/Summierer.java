package a3;

public class Summierer {
    public static void main(String[] args) {
        Summierer summierer = new Summierer();
        int n = transformCLIInputToInteger(args);

        System.out.println("Ergebnis kleiner Gauss: " + summierer.kleinerGauss(n));
        System.out.println("Ergebnis mit for-Schleife: " + summierer.forSumme(n));
        System.out.println("Ergebnis rekursiv: " + summierer.rekursiveSumme(n));
    }


    private static int transformCLIInputToInteger(String[] args) {
        int retVal = 0;
        try {
            if ((retVal = Integer.parseInt(args[0])) < 0) {
                System.out.println("Natural number required >= 0.");
                System.exit(1);
            }

            return retVal;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException $exception) {
            System.out.println("No input integer provided");
            System.exit(1);
        }
        return retVal;
    }

    int kleinerGauss(int n) {
        return (n * (n + 1) / 2);
    }

    int forSumme(int n) {
        int cumulativeSum = 0;
        for (int i = 0; i <= n; i++) {
            cumulativeSum += i;
        }
        return cumulativeSum;
    }

    int rekursiveSumme(int n) {
        return n == 1 ? n : (n + rekursiveSumme(--n));
    }
}
