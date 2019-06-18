package factorymethod;

public class BmwFactory implements CarFactory {
    public Car produceCar() {
        return new Bmw();
    }
}
