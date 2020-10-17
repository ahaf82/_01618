package EA2;

public class CLIHelper {
     public static int transformCLIInputToInteger(String[] args) {
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
