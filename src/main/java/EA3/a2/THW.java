package EA3.a2;


import static EA3.a2.THW_Grade.*;

public class THW {
    public static void main(String[] args)
    {
        printAll();
    }

    private static void printAll() {
        for (THW_Grade grad: THW_Grade.values()) {
            System.out.println(grad.toString());
            System.out.println(HELFER.istVorgesetzterVor(GRUPPENFUEHRER));
            System.out.println(TRUPPFUEHRER.istVorgesetzterVor(HELFER));
            System.out.println(GRUPPENFUEHRER.istVorgesetzterVor(GRUPPENFUEHRER));
        }
    }
}
