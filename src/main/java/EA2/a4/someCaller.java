package EA2.a4;

public class someCaller {

    /**
     * a) (5 Punkte)
     * Erzeugen Sie eine Instanz der Klasse CarFactory und legen Sie eine Referenz auf diese Instanz in einer lokalen
     * Variablen der main-Methode ab.
     *
     * b) (5 Punkte)
     * Besorgen Sie sich von der CarFactory-Instanz ein Auto und legen Sie eine Referenz auf dieses Auto in einer
     * lokalen Variablen der main-Methode ab. Geben Sie mit Hilfe der Methode readMotorPowerInKiloWatt die Motorleistung auf die Standardausgabe aus.
     */

    public static void main(String[] args) {
        // a
        CarFactory carFactory = new CarFactory();
        //b
        Car car = carFactory.giveMeACar();
        System.out.println(car.readMotorPowerInKiloWatt());
        // c
        // Der Aufruf geht nicht, weil die zurückgegebene Klasse der Factory eine Instanz von Car ist, dessen Interface
        // tunePower() nicht deklariert.
        // d
        // Ich verstehe die Frage schon wieder nicht. Was ist "mein Auto" ? Ich vermute ich soll eine CarKlasse direkt instanziieren?
        RealCar powerCar = new RealCar(1);
        powerCar.tunePower();
        System.out.println(powerCar.readMotorPowerInKiloWatt());
    }
}
