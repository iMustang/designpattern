package factorymethod;

public class Main {
    public static void main(String[] args) {
        CarFactory audiFactory = new AudiFactory();
        audiFactory.produceCar().run();

        CarFactory benzFactory = new BenzFactory();
        benzFactory.produceCar().run();

        CarFactory bmwFactory = new BmwFactory();
        bmwFactory.produceCar().run();
    }
}
