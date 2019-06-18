package factorymethod;

public class AudiFactory implements CarFactory {
    public Car produceCar() {
        return new Audi();
    }
}
