package factorymethod;

public class Main {
    public static void main(String[] args) {
        ICarFactory audiFactory = new AudiFactory();
        audiFactory.produceCar().run();

        ICarFactory benzFactory = new BenzFactory();
        benzFactory.produceCar().run();

        ICarFactory bmwFactory = new BmwFactory();
        bmwFactory.produceCar().run();
    }
}
