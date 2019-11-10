package factorymethod;

public class Main {
    public static void main(String[] args) {
        ICar car;

        ICarFactory audiFactory = new AudiFactory();
        car = audiFactory.produceCar();
        car.run();

        ICarFactory benzFactory = new BenzFactory();
        car = benzFactory.produceCar();
        car.run();
    }
}
