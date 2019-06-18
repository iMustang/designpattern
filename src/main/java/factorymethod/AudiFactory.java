package factorymethod;

public class AudiFactory implements ICarFactory {
    public ICar produceCar() {
        return new Audi();
    }
}
