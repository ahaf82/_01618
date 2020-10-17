package EA2.a4;

class CarFactory {
    public Car giveMeACar() {
        return new RealCar(98);
    }
}
